CREATE TABLE `categories` (
	`id` int AUTO_INCREMENT,
	`name` text NOT NULL
);
--> statement-breakpoint
CREATE TABLE `users` (
	`id` int AUTO_INCREMENT,
	`full_name` text NOT NULL,
	`phone_number` text NOT NULL,
	`username` text NOT NULL,
	`password` text NOT NULL,
	`role` enum('admin','customer'),
	`created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT `users_phone_number_unique` UNIQUE(`phone_number`),
	CONSTRAINT `users_username_unique` UNIQUE(`username`)
);
--> statement-breakpoint
DROP TABLE `admins`;--> statement-breakpoint
DROP TABLE `customers`;--> statement-breakpoint
ALTER TABLE `boarding_houses` DROP FOREIGN KEY `boarding_houses_customer_id_customers_id_fk`;
--> statement-breakpoint
ALTER TABLE `transactions` DROP FOREIGN KEY `transactions_customer_id_customers_id_fk`;
--> statement-breakpoint
ALTER TABLE `boarding_houses` MODIFY COLUMN `customer_id` int;--> statement-breakpoint
ALTER TABLE `boarding_houses` ADD `created_at` timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL;--> statement-breakpoint
ALTER TABLE `boarding_houses` ADD `category` text NOT NULL;--> statement-breakpoint
ALTER TABLE `boarding_houses` ADD CONSTRAINT `boarding_houses_category_categories_id_fk` FOREIGN KEY (`category`) REFERENCES `categories`(`id`) ON DELETE cascade ON UPDATE no action;--> statement-breakpoint
ALTER TABLE `boarding_houses` ADD CONSTRAINT `boarding_houses_customer_id_users_id_fk` FOREIGN KEY (`customer_id`) REFERENCES `users`(`id`) ON DELETE cascade ON UPDATE no action;--> statement-breakpoint
ALTER TABLE `transactions` ADD CONSTRAINT `transactions_customer_id_users_id_fk` FOREIGN KEY (`customer_id`) REFERENCES `users`(`id`) ON DELETE cascade ON UPDATE no action;