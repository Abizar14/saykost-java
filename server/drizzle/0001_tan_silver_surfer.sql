CREATE TABLE `boarding_houses` (
	`id` int AUTO_INCREMENT NOT NULL,
	`name` text NOT NULL,
	`image` text NOT NULL,
	`size` text NOT NULL,
	`price` int NOT NULL,
	`address` text NOT NULL,
	`description` text NOT NULL,
	`quantity` int NOT NULL,
	`customer_id` text NOT NULL,
	CONSTRAINT `boarding_houses_id` PRIMARY KEY(`id`)
);
--> statement-breakpoint
ALTER TABLE `boarding_houses` ADD CONSTRAINT `boarding_houses_customer_id_customers_id_fk` FOREIGN KEY (`customer_id`) REFERENCES `customers`(`id`) ON DELETE no action ON UPDATE no action;