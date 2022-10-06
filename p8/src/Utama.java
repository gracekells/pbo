public class Utama {
    public static void main(String[] args) {
    
        //pembuatan objek
        Bicycle sepedaLipat = new Bicycle();
        sepedaLipat.warna = "Merah";
        sepedaLipat.merk = "Pacific";
        sepedaLipat.kecepatan = 0;
        
        System.out.println("Sepeda Lipat");
        System.out.println("Warna \t= " + sepedaLipat.warna);
        System.out.println("Merk \t= " + sepedaLipat.merk);
        System.out.println("Kecepatan Awal = " + sepedaLipat.kecepatan);
        
        //tambah kecepatan
        sepedaLipat.tambahKecepatan();
        System.out.println("Kecepatan Sekarang = " + sepedaLipat.kecepatan);
        //kurangi kecepaatan
        sepedaLipat.kurangKecepatan();
        System.out.println("Kecepatan Sekarang = " + sepedaLipat.kecepatan);
                
        
        Bicycle sepedaGunung = new Bicycle();
        sepedaGunung.warna = "Kuning";
        sepedaGunung.merk = "Kosmos";
        sepedaGunung.kecepatan = 10;
        
        System.out.println("");
        System.out.println("Sepeda Gunung");
        System.out.println("Warna \t= " + sepedaGunung.warna);
        System.out.println("Merk \t= " + sepedaGunung.merk);
        System.out.println("Kecepatan Awal \t= " + sepedaGunung.kecepatan);
        
        //tambah kecepatan
        sepedaGunung.tambahKecepatan();
        System.out.println("Kecepatan Sekarang = " + sepedaGunung.kecepatan);
        
        //kurangi kecepatan
        sepedaGunung.kurangKecepatan();
        System.out.println("Kecepatan Sekarang = " + sepedaGunung.kecepatan);
        
        Bicycle sepedaBMX = new Bicycle();
        sepedaBMX.warna = "Hitam";
        sepedaBMX.merk = "TDR 3000";
        sepedaBMX.kecepatan = 40;
        
        System.out.println("");
        System.out.println("Sepeda BMX");
        System.out.println("Warna \t= " + sepedaBMX.warna);
        System.out.println("Merk \t= " + sepedaBMX.merk);
        System.out.println("Kecepatan Awal \t= " + sepedaBMX.kecepatan);
        
        //kurang kecepatan
        sepedaBMX.kurangKecepatan();
        System.out.println("Kecepatan Sekarang = " + sepedaBMX.kecepatan);
         
    }
}
