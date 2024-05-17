import { User } from '../schema';

export const usersSeed: User[] = [
  {
    id: 1,
    fullName: 'wak sunari',
    phoneNumber: '0812345678919',
    username: 'waksunari',
    password: 'waksunari',
    role: 'admin',
    createdAt: new Date(),
  },
  {
    id: 2,
    fullName: 'joko',
    phoneNumber: '081234567891',
    username: 'joko',
    password: 'joko',
    role: 'customer',
    createdAt: new Date(),
  },
];
