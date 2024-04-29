CREATE TABLE `transactions` (
	`id` int AUTO_INCREMENT,
	`rental_duration` int NOT NULL,
	`total_price` int NOT NULL,
	`created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`boarding_houses_id` int NOT NULL,
	`customer_id` int NOT NULL
);
--> statement-breakpoint
ALTER TABLE `transactions` ADD CONSTRAINT `transactions_boarding_houses_id_boarding_houses_id_fk` FOREIGN KEY (`boarding_houses_id`) REFERENCES `boarding_houses`(`id`) ON DELETE cascade ON UPDATE no action;--> statement-breakpoint
ALTER TABLE `transactions` ADD CONSTRAINT `transactions_customer_id_customers_id_fk` FOREIGN KEY (`customer_id`) REFERENCES `customers`(`id`) ON DELETE cascade ON UPDATE no action;