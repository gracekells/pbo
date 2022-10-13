import java.io.*;

public class MenuUtamaPerulangan {

    public static void main(String[] args) throws IOException{
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int banyak = 0;
        
        System.out.println("Masukkan Banyak Karyawan = ");
        banyak = Integer.parseInt(br.readLine());
        
        Karyawan[] kry = new Karyawan[banyak];
        
        for (int i = 0; 1 < banyak; i++){
            System.out.println("Data Karyawan " + (i+1));
            
            System.out.println("Masukkan NIK = ");
            kry[i].nik = br.readLine();
            System.out.println("Masukkan Nama = ");
            kry[i].nama = br.readLine();
            System.out.println("Masukkan Jabatan = ");
            kry[i].jabatan = br.readLine();
        }
        
        for (int i = 0; 1 < banyak; i++){
            System.out.println("Data Karyawan " + (i+1));
            kry[i].tampilData();
        }
        
        
    }
    
}
