# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa namaMobil dan plat, dan memberikan output berupa informasi detail dari plat tersebut seperti nomot seri, namaMobil, nama provinsi dan nama kabupaten.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. *Class* adalah template atau blueprint dari object. Pada kode ini saya menggunakan plat kendaraan tetapi berupa judulnya contoh saja, `contohplat`, `contohDetail`, dan `contohplatBeraksi` adalah contoh dari class.

bash
public class contohPlat {
    ...
}

public class contohDetail extends {
    ...
}

public class contohplatBeraksi {
    ...
}


2. *Object* adalah instance dari class. Pada kode ini, `NomorSeri[i] = new contohplatDetail(namaMobil, plat);` adalah contoh pembuatan object.

bash
nomorSeri[i] = new contohplatDetail(namaMobil, plat);


3. *Atribut* adalah variabel yang ada dalam class. Pada kode ini, `namaMobil` dan `plat` adalah contoh atribut.

bash
String namaMobil;
String plat;


4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `contohplat` dan `contohplatDetail`.

bash
public Mahasiswa(String namaMobil, String plat) {
    this.namaMobil = namaMobil;
    this.plat = plat;
}

public contohplatDetail(String namaMobil, String plat) {
    super(namaMobil, plat);
}


5. *Mutator* atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

bash
public void setNamaMobil(String namaMobil) {
    this.namaMobil = namaMobil;
}

public void setplat(String plat) {
    this.plat = plat;
}


6. *Accessor* atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaMobil`, `getplat`, `getProvinsi`, `getNomorseri`, `getKabupaten` adalah contoh method accessor.

bash
public String getNamaMobil() {
    return namaMobil;
}
 
public String getplat() {
    return plat;
}


7. *Encapsulation* adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaMobil` dan `plat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

bash
private String namaMobil;
private String plat;


8. *Inheritance* adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `contohplatDetail` mewarisi `contohplat` dengan sintaks `extends`.

bash
public class contohplatDetail extends {
    ...
}


9. *Polymorphism* adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `contohplat` merupakan overloading method `displayInfo` dan `displayInfo` di `contohplatDetail` merupakan override dari method `displayInfo` di `contohplat`.

bash
public String displayInfo() {
        return "plat = "+getPlat()+ "\nNamamobil = "+getNamamobil();
}

//polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nProvinsi = "+getProvinsi()+
            "\nNomorseri = "+getNomorseri()+
            "\nkabupaten = "+getKabupaten(); {
    ...
}


10. *Seleksi* adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch dalam method getProvinsi dan getKabupaten`.

bash
public String getProvinsi() {
        String kodeProvinsi = getPlat().substring(0, 2);
        //seleksi swicth
        switch(kodeProvinsi) {
            case "DA":
                return "Kalimantan selatan";
            case "KH":
                return "Kalimantan Tengah";
            case "KT":
                return "Kalimantan Timut";
            case "KB":
                return "Kalimantan Barat";
            case "KU":
                return "Kalimantan Utara";
            default:
                return "Provinsi lain";
        }
    }
    
    public int getNomorseri(){
          return Integer.parseInt(getPlat().substring(2, 6));   
    }
    
    public String getKabupaten(){
        String kodekabupaten = getPlat().substring(6, 8);
        //seleksi swicth
        switch(kodekabupaten) {
            case "01":
                return "Kandangan(kalsel)";
            case "02":
                return "Muara Teweh(Kalteng)";
            case "DL":
                return "Bontang(Kaltim)";
            case "LP":
                return "Landak(Kalbar)";
            case "SB":
                return "Malinau(Kalut)";
            default:
                return "Dan Seterusnya";
         }
}


11. *Perulangan* adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

bash
for (int i = 0; i < contohplat.length; i++) {
    ...
}


12. *Input Output Sederhana* digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

bash
Scanner scanner = new Scanner(System.in);
System.out.print(" Masukkan Plat"+(i+1)+" = ");
        String plat = scanner.nextLine();
        System.out.print(" Masukkan Namamobil  "+(i+1)+" = ");
        String namamobil = scanner.nextLine();

for(contohplatdetail data : mobil) {
            System.out.println("====================");
            System.out.println("Nomor Seri = ");
            System.out.println(data.displayInfo());
        }


13. *Array* adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `mahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

bash
contohplatDetail[] mahasiswas = new contohplatDetail[2];


14. *Error Handling* digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

bash
try {
   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Plat "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Namamobil"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
}


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | *TOTAL*      | *100* |

## Pembuat

Nama: Muhammad Shufy Auliya
NPM: 2110010091
