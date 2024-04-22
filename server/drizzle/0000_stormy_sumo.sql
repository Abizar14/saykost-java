CREATE TABLE `admins` (
	`id` int AUTO_INCREMENT NOT NULL,
	`full_name` text NOT NULL,
	`username` text,
	`password` text NOT NULL,
	CONSTRAINT `admins_id` PRIMARY KEY(`id`),
	CONSTRAINT `admins_username_unique` UNIQUE(`username`)
);
--> statement-breakpoint
CREATE TABLE `customers` (
	`id` int AUTO_INCREMENT NOT NULL,
	`full_name` text NOT NULL,
	`phone_number` text NOT NULL,
	`username` text,
	`password` text NOT NULL,
	CONSTRAINT `customers_id` PRIMARY KEY(`id`),
	CONSTRAINT `customers_username_unique` UNIQUE(`username`)
);
