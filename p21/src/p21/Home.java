package p21;

import java.io.*;
import mdp.Direktur;
public class Home {

  
    public static void main(String[] args) throws IOException{
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        Direktur dir = new Direktur(" ");
        
        System.out.println("Masukkan NIK = ");
        dir.setNik(br.readLine());
        
        System.out.println("Masukkan Nama = ");
        dir.setNama(br.readLine());
        
        System.out.println("Masukkan Gaji Pokok = ");
        dir.setGajiPokok(Double.parseDouble(br.readLine()));
        
        System.out.println("Masukkan Tunjangan = ");
        dir.setTunjangan(Double.parseDouble(br.readLine()));
        
        System.out.println("==============================");
        System.out.println("NIK \t\t= " + dir.getNik());
        System.out.println("Nama \t\t= " + dir.getNama());
        System.out.println("Gaji Pokok \t= " + (int) dir.getGajiPokok());
        System.out.println("Tunjangan \t= " + (int) dir.getTunjangan());
        System.out.println("Total Gaji \t= " + (int) dir.getTotal());
    }
}
