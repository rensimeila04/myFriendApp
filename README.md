# myFriendApp
## Room Database
> Room Database digunakan untuk menyimpan data secara lokal. Aplikasi yang menangani data terstruktur dalam jumlah sangat banyak akan sangat terbantu jika data tersebut disimpan secara lokal. Kasus penggunaan yang paling umum adalah membuat cache dari bagian-bagian data yang relevan. Dengan demikian, ketika perangkat tidak dapat mengakses jaringan, pengguna masih dapat menjelajahi konten ketika offline. Setiap perubahan konten yang diinisiasi oleh pengguna kemudian akan disinkronkan ke server setelah perangkat kembali online. [Selengkapnya](https://developer.android.com/training/data-storage/room?hl=id)

> Penyimpanan (database) local atau Room, perlu menambahkan plugin 'kotlin-kapt' pada build.gradle (module: app). Kemudian, menambahkan library Room di dalam dependencies apply plugin: 'kotlin-kapt'

    implementation 'android.arch.persistence.room:runtime:1.1.1'
    kapt 'android.arch.persistence.room:compiler:1.1.1'
    
> Sebuah database berbasis table memerlukan sekumpulan perintah khusus untuk mengakses data yang disebut dengan SQL (Structured Query Language). Pada database Room, perlu dibuat sebuah interface berisi SQL yang disebut DAO. Sebuah DAO dapat diisi dengan perintah SQL untuk menambahkan (insert), mengubah (update), menghapus (delete), dan mengambil (get) data.
   
    MyFriendDao.kt

    @Dao
    interface MyFriendDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun tambahTeman(friend: MyFriend)
    @Query("SELECT * FROM MyFriend")
    fun ambilSemuaTeman(): LiveData<List<MyFriend>>
    } 

## Fragment
> Fragment adalah class yang memiliki fungsi sama seperti Activity, akan tetapi Fragment tidak bisa
berdiri sendiri. Sebuah Fragment harus bergantung pada sebuah Activity. Dalam analogi
sederhana, Fragment bisa dianggap sebuah child dan Activity adalah parent, sebagaimana
ViewGroup dan View. Contoh pada aplikasi GOJEK Pada aplikasi GOJEK di atas, tampilan Fragment seperti pada GoRide, GoCar, GoFood, dan
GoShop yang ditampilkan dalam satu Activity. [Selengkapnya](https://developer.android.com/guide/components/fragments?hl=id)
## Berikut adalah langkah-langkah untuk menambahkan file .kt pada project:
- [x] Klik kanan pada direktori app/java/<package project>
- [x] Pilih New, Kotlin File/Class
- [x] Beri nama MyFriendsFragment dan pilih Kind: Class, OK

# Contoh Penggunaan fragment pada aplikasi GOJEK
![gambar](https://github.com/rensimeila04/myFriendApp/blob/master/ss%20myfriendapp/gojek.jpg)
  
# Fragment pada myFriendApp
![gambar1](https://github.com/rensimeila04/myFriendApp/blob/master/ss%20myfriendapp/s.jpg)

# Tampilan tambah
![gambar2](https://github.com/rensimeila04/myFriendApp/blob/master/ss%20myfriendapp/p.jpg)

# Tampilan setelah di tambah
![gambar3](https://github.com/rensimeila04/myFriendApp/blob/master/ss%20myfriendapp/r.jpg)
