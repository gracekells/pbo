
public class Bicycle {
    
    //state = ciri2
    //akan menjadi variabel
    String warna = "Merah";
    String merk = "Pacific";
    int kecepatan = 0;
    
    
    //behavior = tingkah laku
    //akan menjadi method
    
    public void tambahKecepatan(){
        kecepatan = kecepatan + 10;
    }
    
    public void kurangKecepatan(){
        kecepatan = kecepatan - 5;
    }
    
}
