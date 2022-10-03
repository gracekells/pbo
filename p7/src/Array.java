import java.io.*;
public class Array {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String ulang = "Y";
        
        while (ulang.equalsIgnoreCase("Y")){
            System.out.println("Masukkan Banyak Barang yang Dibeli = ");
            int banyak = Integer.parseInt(br.readLine());

            String kode [] = new String [banyak];
            String nama[] = new String [banyak]; 
            int harga [] = new int [banyak];

            //input
            for (int i = 0; i < kode.length; i++){
                System.out.println("Masukkan Kode Barang " + (i+1) + " = ");
                kode[i] = br.readLine();

                if (kode[i].equalsIgnoreCase("B01")){
                    nama[i] = "Pena";
                    harga[i] = 1000;
                } else if (kode[i].equalsIgnoreCase("B02")){
                    nama[i] = "Buku";
                    harga[i] = 5000;
                } else {
                    nama[i] = "";
                    harga[i] = 0;
                }
            }

    //        for (int i = 0; i < nama.length; i++){
    //            System.out.print("Masukkan Nama Barang " + (i+1) + " = ");
    //            nama[i] = br.readLine();
    //        }

            //output
            System.out.println("Barang yang Dibeli = ");
            System.out.println("Kode Barang \tNama Barang \tHarga");
            for(int i = 0; i < kode.length; i++){
                System.out.println(kode[i] + "\t\t" + nama[i] + "\t\t" + harga[i]);
    //            System.out.println((i+1) + ". " + nama[i]);       
            }

            System.out.println("Apakah Anda Ingin Mengulang Program? <Y/T> = ");
            ulang = br.readLine();
            
            if(ulang.equalsIgnoreCase("T")){
                System.out.println("Terima Kasih");
                
            }
            
        }
    }
}
