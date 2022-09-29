import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MenuUtama {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        //input
        System.out.print("Masukkan Nama Anda \t= ");
        String nama  = br.readLine();
        
        System.out.print("Masukkan NPM Anda \t= ");
        String npm  = br.readLine();
        
        System.out.print("Masukkan Prodi Anda \t= ");
        String prodi  = br.readLine();
        
        System.out.print("Masukkan Umur Anda \t= ");
        int umur = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Nilai Anda \t= ");
        double nilai = Double.parseDouble(br.readLine());
        
        //output
        System.out.println("Data Mahasiswa");
        System.out.println("Nama \t= " + nama);
        System.out.println("NPM \t= " + npm);
        System.out.println("Prodi \t= " + prodi);
        System.out.println("Umur \t= " + umur);
        System.out.println("Nilai \t= " + nilai);
              
    }
}
