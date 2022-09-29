import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Latihan {

    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String nama = "";
        String ulang = "Y";
        int harga = 0, total = 0;
        
        while (ulang.equals("Y")){
            System.out.println("Masukkan Kode Barang = ");
            String kode = br.readLine();
        
        if (kode.equalsIgnoreCase("B001")){
            nama = "Pena";
            harga = 3000;
        }
        else if (kode.equalsIgnoreCase("B002")){
            nama = "Buku";
            harga = 5000;
        }
        else if (kode.equalsIgnoreCase("B003")){
            nama = "Pensil";
            harga = 2000;
        }
        else if (kode.equalsIgnoreCase("B004")){
            nama = "Penggaris";
            harga = 1000;
                
        }
        else if (kode.equalsIgnoreCase("B005")){
            nama = "Penghapus";
            harga = 1500;
        }
        
        
        
        total = harga * jumlah;
        
        }
        
    }
    
}
