import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Perulangan {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        //perulangan
        //cetak 5-20
        for(int i = 5; i <= 20; i = i+1){
            System.out.println(i);
        }
        
        //i++ itu sama dengan i+1
        //i-- itu sama dengan i-1
        
        //cetak 100 - 1
        System.out.println("Angka 100 - 1");
        for(int i = 100; i >= 1; i--){
            System.out.println("Perulangan Ke - " + i);
        }
        
        //perulangan for
        //cetak 1-10
        for (int i = 1; i <= 10; i++){
        System.out.println(i);
        }
       
    }
    
}
