import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Latihan {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        //output
        System.out.println("=======================");
        System.out.println("1. Luas Persegi Panjang");
        System.out.println("2. Luas Segitiga");
        System.out.println("=======================");
        
        //input
        System.out.print("Masukkan Pilihan <1/2> = ");
        int pilihan = Integer.parseInt(br.readLine());
        
        if (pilihan == 1){
            //input luas persegi panjang
            System.out.print("Masukkan Panjang = ");
            int panjang = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan Lebar \t = ");
            int lebar = Integer.parseInt(br.readLine());
            int luas = panjang * lebar;

            //output luas persegi panjang
            System.out.println("Luas Persegi Panjang adalah " + luas + " cm2");
        }
        
        else {
            //input luas segitiga
            System.out.print("Masukkan Alas = ");
            int alas = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan Tinggi = ");
            int tinggi = Integer.parseInt(br.readLine());
            
            double luassegitiga = (0.5 * alas * tinggi);

            //output
            System.out.println("Luas Segitiga adalah " + luassegitiga + " cm2");
        }

    }
    
}
