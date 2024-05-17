ALTER TABLE `categories` MODIFY COLUMN `id` int AUTO_INCREMENT NOT NULL;--> statement-breakpoint
ALTER TABLE `transactions` MODIFY COLUMN `id` int AUTO_INCREMENT NOT NULL;--> statement-breakpoint
ALTER TABLE `users` MODIFY COLUMN `id` int AUTO_INCREMENT NOT NULL;--> statement-breakpoint
ALTER TABLE `categories` ADD PRIMARY KEY(`id`);--> statement-breakpoint
ALTER TABLE `transactions` ADD PRIMARY KEY(`id`);--> statement-breakpoint
ALTER TABLE `users` ADD PRIMARY KEY(`id`);