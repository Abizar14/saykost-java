<p align="center">
  <img src="https://github.com/Abizar14/saykost-java/blob/master/img/SAY1.png" width="300px">
</p>  

Selamat datang di repositori "Say Kost". Repositori ini merupakan aplikasi untuk memenuhi tugas Ujian Akhir Semester 4.

## Deskripsi

Aplikasi **Say Kost** adalah aplikasi untuk masyarakat yang ingin mencari kost dan dapat melakukan transaksi dalam aplikasi.
Fitur aplikasi ini meliputi:
1. Autentikasi User:
   - Aplikasi bisa melakukan register untuk customer baru.
   - Aplikasi harus memungkinkan user untuk melakukan login menggunakan akun
mereka yang di register. Autentikasi user harus memastikan keabsahan akses user.
   - Kalau user adalah admin, tampilkan dashboard admin dengan previllage-nya.
   - Kalau user adalah customer, tampilkan dashboard dengan detail tabel kost.
3. Tampilan Dashboard Admin:
   - CRUD KOST
   - Melihat data transaksi dari semua customer
   - Melihat data semua customer
5. Tampilan Dashboard Customer:
   - Melihat daftar kost
   - Membuat transaksi pada kost tertentu
   - Melihat riwayat transaksi customer yang login saat ini, tidak semua customer

## Tujuan

- Memenuhi tugas Ujian Akhir Semester 4 mata kuliah Pemrograman Multimedia Interaktif.
- Memahami prinsip dasar Pemrograman Multimedia Interaktif menggunakan Java Swing.

## Teknologi Yang Digunakan
<p align="center">
  <img src="https://github.com/Abizar14/saykost-java/assets/115654535/573311cd-d507-4b48-9f2c-1aa4e1436a2c" width="200px" alt="Java">
  <img src="https://github.com/Abizar14/saykost-java/assets/115654535/2c2d1c84-05cb-41e1-b006-d0e08cd99e18" width="200px" alt="TypeScript">
  <img src="https://github.com/Abizar14/saykost-java/assets/115654535/17c97478-d396-4d85-bcfd-9f641ae2e789" width="200px" alt="MySql">
</p>

- Java Swing: Teknologi utama untuk aplikasi desktop ini.
- TypeScript: Teknologi untuk set up database.
- MySql: Teknologi database yang digunakan


## Struktur Repositori

- `src/main/java/` berisi kode sumber Java untuk repositori ini.
- `src/main/java/client` berisi kode sumber Java ***Front-End***.
- `src/main/java/services` berisi kode sumber Java ***Back-End***.
- `img/` kumpulan asset gambar.
- `img/upload/` kumpulan gambar kost. (direktori upload otomatis dibuat jika admin membuat kost baru)
> [!IMPORTANT]
> `server/` berisi kode untuk melakukan set up database menggunakan TypeScript.

## Cara Menjalankan!

Kamu dapat menjalankan repositori ini di IDE Java kamu. Pastikan kamu memiliki `Java Development Kit (JDK)` yang sudah diinstal.
> [!IMPORTANT]    
> Pastikan Tools berikut sudah terinstal di perangkat kamu!.
> - Git
> - NodeJS
> - Xampp
1. Jalankan perintah berikut di Terminal atau CMD untuk mengunduh repositori ini:

       git clone https://github.com/Abizar14/saykost-java.git
   
3. Masuk ke direktori atau repositori yang sudah diunduh:

       cd saykost-java
   
4. Jalankan aplikasi `Xampp` kamu lalu buat database dengan nama uas_java
5. Kembali ke terminal tadi, jalankan perintah berikut untuk masuk ke direktori server dan melakukan set up database

        cd server
        npm i
        npm run db:generate
        npm run db:push
        npm run dev
7. Buka browser, lalu ketik url:
   - `localhost:3000/users` untuk melakukan seed data users
   - `localhost:3000/categories` untuk melakukan seed data categories
8. Buka repositori `saykost-java` dengan *IDE* Java Anda (disini kami menggunakan `NetBeans`).
9. Buka file `pom.xml`, lalu perhatikan didalam tag `<properties><properties>` pada tag `maven.compiler.` ubah sesuai versi compiler java kamu!.
10. Build project untuk memuat dependencies.
> [!WARNING]
> Jika saat melakukan build terdapat error, maka download dan install manual dependencies (`.jar files`) yang sesuai dengan nama dan versinya.
10. Jika sudah sukses melakukan build, pada directory `src/main/java/client` jalankan class `Login.java`
11. Login menggunakan data user berikut:
    - admin:
      - username: waksunari
      - password: waksunari
    - customer:
      - username: joko
      - password: joko

<h1 align="center">Selamat Menggunakan 😉</h1>
