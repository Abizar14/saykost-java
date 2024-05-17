import { sql } from 'drizzle-orm';
import { int, mysqlTable, text, timestamp } from 'drizzle-orm/mysql-core';

export const users = mysqlTable('users', {
  id: int('id').autoincrement(),
  fullName: text('full_name').notNull(),
  phoneNumber: text('phone_number').unique().notNull(),
  username: text('username').unique().notNull(),
  password: text('password').notNull(),
  role: text('role', { enum: ['admin', 'customer'] }).notNull(),
  createdAt: timestamp('created_at')
    .notNull()
    .default(sql`CURRENT_TIMESTAMP`),
});
export type User = typeof users.$inferSelect;

export const categories = mysqlTable('categories', {
  id: int('id').autoincrement(),
  name: text('name').notNull(),
});
export type Category = typeof categories.$inferSelect;

export const boardingHouses = mysqlTable('boarding_houses', {
  id: int('id').autoincrement(),
  name: text('name').notNull(),
  image: text('image').notNull(),
  size: text('size').notNull(),
  price: int('price').notNull(),
  address: text('address').notNull(),
  description: text('description').notNull(),
  quantity: int('quantity').notNull(),
  createdAt: timestamp('created_at')
    .notNull()
    .default(sql`CURRENT_TIMESTAMP`),
  category: int('category')
    .notNull()
    .references(() => categories.id, { onDelete: 'cascade' }),
  customerId: int('customer_id').references(() => users.id, {
    onDelete: 'cascade',
  }),
});
export type BoardingHouse = typeof boardingHouses.$inferSelect;

export const transactions = mysqlTable('transactions', {
  id: int('id').autoincrement(),
  rentalDuration: int('rental_duration').notNull(),
  totalPrice: int('total_price').notNull(),
  createdAt: timestamp('created_at')
    .notNull()
    .default(sql`CURRENT_TIMESTAMP`),
  boardingHouseId: int('boarding_houses_id')
    .notNull()
    .references(() => boardingHouses.id, { onDelete: 'cascade' }),
  customerId: int('customer_id')
    .notNull()
    .references(() => users.id, { onDelete: 'cascade' }),
});
export type Transaction = typeof transactions.$inferSelect;
