import express, { Express } from 'express';
import { db } from './db/db';
import * as schema from './schema';
import { usersSeed } from './seeds/users';
import { categoriesSeed } from './seeds/categories';

const app: Express = express();
const port = 3000;

app.get('/users', async (req, res) => {
  const users = await db.insert(schema.users).values(usersSeed);
  res.json(users);
});

app.get('/categories', async (req, res) => {
  const categories = await db.insert(schema.categories).values(categoriesSeed);
  res.json(categories);
});

app.listen(port, async () => {
  console.log(`[server]: Server is running at http://localhost:${port}`);
});
