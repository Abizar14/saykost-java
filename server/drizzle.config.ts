import { Config, defineConfig } from 'drizzle-kit';

export default {
  schema: './src/schema.ts',
  out: './drizzle',
  driver: 'mysql2', // 'pg' | 'mysql2' | 'better-sqlite' | 'libsql' | 'turso'
  dbCredentials: {
    // uri: 'localhost:3306/uas_java',
    host: '127.0.0.1',
    port: 3306,
    user: 'root',
    password: '',
    database: 'uas_java',
  },
  breakpoints: true,
} satisfies Config;
