public class MenuUtama {

    public static void main(String[] args) {
        //garis();
        garis(1);
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.setNpm("2024240057");
        mhs.setNama("Grace Kelly Suryadinatan");
        mhs.setUmur(20);
        
        //mhs.tampilData();
        System.out.println("NPM \t= " + mhs.getNpm());
        System.out.println("Nama \t= " + mhs.getNama());
        System.out.println("Umur \t= " + mhs.getUmur());
        garis(2);
        //garis();
                
    }
    
    //overloading method = nama method yg sama ditulis berulang kali
    public static void garis(){
        System.out.println("=======================================");
    }
    
    public static void garis(int byk){
        for (int i=1; i<=byk; i++){
            System.out.println("=======================================");
        }
    }   
}