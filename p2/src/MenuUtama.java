// p2 Kamis, 15 Septermber 2022

public class MenuUtama {
    public static void main (String[] args) {
//        System.out.println("NPM \t= 2024240057");
//        System.out.println("Nama \t= Grace Kelly Suryadinatan");
        
        //print = mencetak tidak menambahkan enter di akhir
        //println = mencetak dan menambahkan enter di akhir
        
        //Tipe data
        //1. Kata/ Kalimat = String
        //2. Bilangan Bulat = int
        //3. Bilangan Decimal = double, float
        
        String nama = "Grace";
        String alamat = "Jl. Beliton No. 3A";
        int umur = 20;
        double nilai = 99.5 ;
        String pinAtm = "123456";
        String kodeBarang = "B001";
        double harga = 90000;
        double phiLingkaran = 3.14;
        
        System.out.println("Nama \t\t= " + nama);
        System.out.println("Alamat \t\t= " + alamat);
        System.out.println("Umur \t\t= " + umur);
        System.out.println("Nilai \t\t= " + nilai);
        System.out.println("Pin ATM \t= " + pinAtm);
        System.out.println("Kode Barang \t= " + kodeBarang);
        System.out.println("Harga \t\t= " + harga);
        System.out.println("Phi Lingkaran \t= " + phiLingkaran);
        
        //Operator Aritmatika
        int bil1 = 5;
        int bil2 = 10;
        
        System.out.println("bil1 + bil2 = " + (bil1 + bil2));
        System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2));
        System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
        System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2));
        System.out.println(bil1 + " / " + bil2 + " = " + (bil1 / bil2));
        
        
        //Seleksi Kondisi IF
        
        //String perbandingannya menggunakan equals
        //equals = Huruf besar huruf kecil harus sama persis (PBO harus besar kecil sama persis)
        //equals ignore case = huruf besar dan huruf kecil tidak diperhatikan
        
        //Apa nama mata kuliahmu? PBO = Benar
        
        String matakuliah = "PBO";
        String prodi = "SI";
        if (matakuliah.equals("pbo")) {
            System.out.println("BENAR");
        } else {
            System.out.println("SALAH");
        }
        
        if (prodi.equalsIgnoreCase("SI")) {
            System.out.println("SISTEM INFORMASI");
        } else {
            System.out.println("SALAH PRODI");
        }
        
        //selain string, pakai tanda sama dengan 2 kali saja
        
        //jika umur == 20 boleh masuk bioskop
        
        if (umur == 20) {
            System.out.println("Boleh Masuk Bioskop");
        } else {
            System.out.println("Tidak Boleh Masuk Bioskop");
        }
        
        
    }
}
