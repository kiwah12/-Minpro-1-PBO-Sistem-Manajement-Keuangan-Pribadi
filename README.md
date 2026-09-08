# SISTEM MANAJEMENT KEUANGAN PRIBADI

## <b>1. Deskripsi Singkat Program</b>

Sistem Manajemen Keuangan Pribadi merupakan program berbasis Java yang berguna untuk mengelola data transaksi keuangan pribadi, 
seperti pemasukan dan pengeluaran. Program ini dijalankan melalui console dan menggunakan ArrayList untuk menyimpan data transaksi selama program berjalan.

Program ini memiliki tiga menu utama, yaitu:

- **Tambah Transaksi**, digunakan untuk menambahkan data transaksi baru, seperti tanggal, jenis transaksi, kategori, dan jumlah uang.

- **Lihat Semua Transaksi**, digunakan untuk menampilkan seluruh data transaksi yang telah ditambahkan.
  
- **Lihat Ringkasan Keuangan**, digunakan untuk menampilkan ringkasan keuangan, seperti total pemasukan, total pengeluaran, dan saldo.

Selain itu, program menyediakan menu Keluar untuk mengakhiri program. Pengelolaan data transaksi pada sistem ini menerapkan konsep **CRUD** (Create, Read, Update, Delete), 
yaitu menambah, melihat, mengubah, dan menghapus data transaksi.

## **2. Penjelasan Alur Program**

Ketika program dijalankan, sistem akan menampilkan Menu Utama yang terdiri dari menu Tambah Transaksi, Lihat Semua Transaksi, Lihat Ringkasan Keuangan, dan Keluar.

Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia.

### **A. Menu Tambah Transaksi**

Menu Tambah Transaksi digunakan untuk menambahkan data transaksi keuangan pribadi.

Pengguna akan diminta memasukkan beberapa data transaksi, seperti:

1. **Tanggal**
Pengguna memasukkan tanggal terjadinya transaksi.
2. **Jenis Transaksi**
Pengguna memilih jenis transaksi, yaitu pemasukan atau pengeluaran.
3. **Kategori**
Pengguna memasukkan kategori transaksi, seperti makanan, transportasi, gaji, dan kebutuhan lainnya.
4. **Jumlah**
Pengguna memasukkan jumlah uang dari transaksi tersebut.

Setelah semua data dimasukkan, sistem akan menyimpan data transaksi ke dalam ArrayList dan menampilkan pesan bahwa transaksi berhasil ditambahkan.

### **B. Menu Lihat Semua Transaksi**

Menu Lihat Semua Transaksi digunakan untuk menampilkan seluruh data transaksi keuangan yang telah ditambahkan.

Sistem akan menampilkan informasi setiap transaksi, seperti **ID, tanggal, jenis transaksi, kategori, dan jumlah uang**. Dengan menu ini, pengguna dapat melihat riwayat transaksi keuangan yang tersimpan selama program berjalan.

### **C. Menu Lihat Ringkasan Keuangan**

Menu Lihat Ringkasan Keuangan digunakan untuk melihat kondisi keuangan berdasarkan seluruh transaksi yang telah dimasukkan.

Sistem akan menghitung dan menampilkan beberapa informasi, yaitu:

1. **Total Pemasukan**, yaitu jumlah keseluruhan uang yang masuk.
2. **Total Pengeluaran**, yaitu jumlah keseluruhan uang yang keluar.
3. **Saldo**, yaitu hasil perhitungan dari total pemasukan dikurangi total pengeluaran.

Dengan menu ini, pengguna dapat mengetahui kondisi keuangan berdasarkan transaksi yang telah dicatat.

### **D. Keluar Program**

Jika pengguna memilih menu **0. Keluar** pada Menu Utama, sistem akan menampilkan pesan bahwa program selesai dan program akan berhenti.
p
