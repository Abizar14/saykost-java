ALTER TABLE `boarding_houses` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `categories` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `transactions` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `users` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `boarding_houses` MODIFY COLUMN `id` int AUTO_INCREMENT;--> statement-breakpoint
ALTER TABLE `categories` MODIFY COLUMN `id` int AUTO_INCREMENT;--> statement-breakpoint
ALTER TABLE `transactions` MODIFY COLUMN `id` int AUTO_INCREMENT;--> statement-breakpoint
ALTER TABLE `users` MODIFY COLUMN `id` int AUTO_INCREMENT;