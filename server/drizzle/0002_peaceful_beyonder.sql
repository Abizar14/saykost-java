ALTER TABLE `boarding_houses` DROP FOREIGN KEY `boarding_houses_customer_id_customers_id_fk`;
--> statement-breakpoint
ALTER TABLE `boarding_houses` ADD CONSTRAINT `boarding_houses_customer_id_customers_id_fk` FOREIGN KEY (`customer_id`) REFERENCES `customers`(`id`) ON DELETE cascade ON UPDATE no action;