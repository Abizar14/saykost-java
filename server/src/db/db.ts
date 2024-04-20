import { drizzle } from 'drizzle-orm/mysql2';
import mysql from 'mysql2/promise';
import * as schema from '../schema';
import { migrate } from 'drizzle-orm/mysql2/migrator';

// Create the connection
const connection = mysql.createPool(
  // 'localhost:3306/uas_java' as string,
  {
    host: 'localhost',
    port: 3306,
    user: 'root',
    password: '',
    database: 'uas_java',
  },
);

export const db = drizzle(connection, {
  schema,
  mode: 'planetscale',
});

// migrate(db, { migrationsFolder: 'drizzle' });
// connection.end();
