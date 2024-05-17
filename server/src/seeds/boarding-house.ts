import { BoardingHouse } from '../schema';

const uniqueDate = new Date().getTime();
export const boardingHouseSeed: BoardingHouse[] = [
  {
    id: 2,
    name: 'Kost Suka Maju',
    image: `./img/upload/Kost Suka Maju-${uniqueDate}.jpg`,
    size: '123m x 23m',
    price: 12345,
    address: 'jalan jalan',
    description: 'Ini Kost suka maju',
    quantity: 4,
    category: 2,
    customerId: 2,
    createdAt: new Date(),
  },
];
