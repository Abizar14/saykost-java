import express, { Express } from 'express';
import { db } from './db/db';
import * as schema from './schema';
import { usersSeed } from './seeds/users';

const app: Express = express();
const port = 3000;
const usersData = usersSeed;
app.get('/', async (req, res) => {
  const users = await db.insert(schema.users).values([
    {
      fullName: 'joko',
      phoneNumber: '08123',
      username: 'joko',
      password: 'joko',
      role: 'customer',
    },
    {
      fullName: 'wak sunari',
      phoneNumber: '081234',
      username: 'waksunari',
      password: 'waksunari',
      role: 'admin',
    },
  ]);
  res.json(users);
});

app.listen(port, async () => {
  console.log(`[server]: Server is running at http://localhost:${port}`);
});
