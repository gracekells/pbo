import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Latihan {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        System.out.print("Masukkan Banyak Mahasiswa = ");
        int data = Integer.parseInt(br.readLine());
        
        //buat array
        String nama[] = new String[data];
        
        //memasukkan data ke dalam Array
        for (int i =0; i <nama.length; i++){
            System.out.print("Masukkan Nama Mahasiswa Ke - " + (i+1) + " = ");
            nama [i] = br.readLine();
        }
        
        //mencetak data
        for (int i = 0; i < nama.length; i++){
            System.out.println("Nama Mahasiswa Ke - " + (i+1) + " = " + nama[i]);
        }
        
        
    }
}
