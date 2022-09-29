import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Perulangan2 {

    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        //Masukkan bilangan awal, masukkan bilangan akhir
        System.out.print("Masukkan Bilangan Awal = ");
        int bilawal = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Bilangan Akhir = ");
        int bilakhir = Integer.parseInt(br.readLine());
        
        for (int i = bilawal; i <= bilakhir; i = i + 1){
            System.out.println(i);
        }    
            
        //for (int i = bilawal; i >= bilakhir; i++){
        //    System.out.println(i);
            
        }
        
    }  

