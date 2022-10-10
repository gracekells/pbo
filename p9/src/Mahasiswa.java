
import javax.xml.transform.Source;


public class Mahasiswa {
    //atribut global
    String npm;
    String nama;
    String prodi;
    
    //method
    //ada 2 jenis, yaitu:
    //1. void method = method tanpa nilai balik
    //2. return method = method dengan nilai balik
    
    //void method
    public void cetakKalimat(){
        System.out.println("Selamat Belajar");        
    }
    
    public void tampilNpm(){
        System.out.println("NPM \t= " + npm);
    }
    
    public void tampilNpmNama(){
        System.out.println("NPM \t= " + npm);
        System.out.println("Nama \t= " + nama);
    }
    
    public void tampilMahasiswa(){
        System.out.println("NPM \t= " + npm);
        System.out.println("Nama \t= " + nama);
        System.out.println("Prodi \t= " + prodi);
    }
    
    public void cetakGaris(){
        System.out.println("===================================");
    }
    
    //void dengan parameter
    public void tampilMahasiswa(String npm, String nama, String prodi){
        System.out.println("NPM \t= " + npm);
        System.out.println("Nama \t= " + nama);
        System.out.println("Prodi \t= " + prodi);
    }
    
    
    //return method
    public String tampilKalimat(){
        return "Belajar Java";
    }
    
    public int luasPersegi(){
        //atribut lokal
       int sisi = 5;
       return sisi * sisi;
    }
    
    //atribut dengan parameter
    public double luasSegitiga(double alas, double tinggi){
        return alas * tinggi * 0.5;
    }
    
    public int luasPersegiPanjang(int panjang, int lebar){
        return panjang * lebar;
    }
    
}
