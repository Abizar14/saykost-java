ALTER TABLE `categories` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `transactions` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `users` DROP PRIMARY KEY;--> statement-breakpoint
ALTER TABLE `categories` MODIFY COLUMN `id` int;--> statement-breakpoint
ALTER TABLE `transactions` MODIFY COLUMN `id` int;--> statement-breakpoint
ALTER TABLE `users` MODIFY COLUMN `id` int;