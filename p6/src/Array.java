
public class Array {
    public static void main(String[] args) {
        
        //cara mendefinisikan array:
        //1. String [] nama;
        //2. String nama [];
        
        //string nama [5];
        //nama 5 artinya ukuran array hanya bisa berisi 5 data
        
        String nama [] = {"Nur Hadi", "Andika", "Andry", "Grace", "Joanna"};
        System.out.println("Data Mahasiswa Ke-1 = " + nama [0]);
        System.out.println("Data Mahasiswa Ke-2 = " + nama [1]);
        System.out.println("Data Mahasiswa Ke-3 = " + nama [2]);
        System.out.println("Data Mahasiswa Ke-4 = " + nama [3]);
        System.out.println("Data Mahasiswa Ke-5 = " + nama [4]);
        
        for (int i = 0; i < nama.length; i++){
            System.out.println("Data Mahasiswa Ke - " + (i + 1) + " = " + nama[i]);
        }
    }
}
