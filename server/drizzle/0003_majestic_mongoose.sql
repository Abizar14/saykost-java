ALTER TABLE `admins` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `boarding_houses` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `customers` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `admins` MODIFY COLUMN `id` int AUTO_INCREMENT;--> statement-breakpoint
ALTER TABLE `boarding_houses` MODIFY COLUMN `id` int AUTO_INCREMENT;--> statement-breakpoint
ALTER TABLE `customers` MODIFY COLUMN `id` int AUTO_INCREMENT;