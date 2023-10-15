# Dokumentasi Post Test Back-End Developer Bootcamp Multipolar

Nama: Yunanti Moga Hasanah
Prodi: Matematika

##  Nama Aplikasi
Aplikasi ini bernama Bank Application

## Deskripsi Aplikasi
Aplikasi ini dibuat untuk mengelola layanan internet bank dari suatu client perbankan. Aplikasi ini menerapkan mikroservice agar mempermudah pengelolahan dan menghindari terjadinya error yang dapat mengganggu bagian-bagian fitur lainnya. Adapun untuk service yang akan dibuat terdapat 3 dalam aplikasi ini yaitu:
1. Product, berfungsi sebagai pengolahan informasi product bank seperti nama, tipe, rating ketertarikan, saldo minimal, jumlah pinjaman maksimal, syarat dan ketentuan, serta waktu dan tanggal transaksi.
2. Gateway, berfungsi sebagai pintu penghubung client atau pengguna dengan service-service yang ada di dalam aplikasi bank.
3. Logging, berfungsi sebagai penyimpan aktivitas apa saja yang dilakukan di service gateway.

## Pemakaian Account Service
1. Pengguna dapat membuat, membaca, memperbaiki, dan menghapus product dengan bantuan tools postman atau swagger. Pada service ini telah disediakan api dokumentasi melalui swagger yang dapat diakses melalui http://localhost:8081/swagger-ui/index.html.
2. Semua data product akan tersimpan pada database MongoDB.
3. Service ini menggunakan HTTP Rest API sebagai inter-service communication karena diperlukannya respon secara spontan. Adapun HTTP Rest API yang tersedia pada service ini adalah GET, GET by id, POST, PUT by id, dan DELETE by id.

## Tools Account Service 
JAVA, SPRING BOOT, MAVEN, MONGODB, LOMBOK, SWAGGER, POSTMAN

# account-posttest-bootcamp-multipolar
Service Account untuk Aplikasi Bank
