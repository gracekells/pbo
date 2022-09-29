import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class latihan {

   public static void main(String[] args) throws IOException {
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        //input
        System.out.print("Masukkan Panjang = ");
        int panjang = Integer.parseInt(br.readLine());
                
        System.out.print("Masukkan Lebar \t = ");
        int lebar = Integer.parseInt(br.readLine());
        
        int luas = panjang * lebar;
        
        //output
        System.out.println("Luas Persegi Panjang adalah " + luas + " cm2");

    }
    
}
