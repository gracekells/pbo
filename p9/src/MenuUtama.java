
public class MenuUtama {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();
        System.out.println("Contoh Void Method tanpa Parameter");
        mhs.npm = "2024240057";
        mhs.nama = "Grace Kelly Suryadinatan";
        mhs.prodi = "Sistem Informasi";
        
        mhs.cetakGaris();
        mhs.cetakKalimat();
        
        mhs.cetakGaris();
        mhs.tampilNpm();
        
        mhs.cetakGaris();
        mhs.tampilNpmNama();
        
        mhs.cetakGaris();
        mhs.tampilMahasiswa();
        
        System.out.println("");
        System.out.println("Contoh Void Method dengan Parameter");
        mhs.tampilMahasiswa("2024240057", "Grace", "Sistem Informasi");
        
        
        System.out.println("");
        System.out.println("Contoh Return Method tanpa Parameter");
        System.out.println(mhs.tampilKalimat());
        
        System.out.println("=======================================");
        System.out.println("Luas Persegi = " + mhs.luasPersegi());
        
        System.out.println("=======================================");
        System.out.println("Contoh Return Method dengan Parameter");
        
        System.out.println("=======================================");
        System.out.println("Luas Segitiga = " + mhs.luasSegitiga(5, 4));
        
        System.out.println("=======================================");
        System.out.println("Luas Persegi Panjang = " + mhs.luasPersegiPanjang(10, 5));
        
    }
    
}
