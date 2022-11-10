import java.util.ArrayList;

public class MenuUtama {

    public static void main(String[] args) {
        Tim tim = new Tim();
        tim.setNama("Manchester United");
        
        System.out.println("Tim \t= " + tim.getNama());
        
        Pemain pemain1 = new Pemain();
        pemain1.setNama("Christian Ronaldo");
        
        Pemain pemain2 = new Pemain();
        pemain2.setNama("Eriksen");
        
        Pemain pemain3 = new Pemain();
        pemain3.setNama("Messi");
        
//        System.out.println("Pemain 1 \t= " + pemain1.getNama());
//        System.out.println("Pemain 2 \t= " + pemain2.getNama());
        
        
        //Menambahkan pemain ke dalam tim
        ArrayList<Pemain> tambahPemain = new ArrayList<Pemain>();
        tambahPemain.add(pemain1);
        tambahPemain.add(pemain2);
        tambahPemain.add(pemain3);
        
        tim.setPemain(tambahPemain);
        
        System.out.println("");
        System.out.println("Daftar Pemain Manchester United : ");
        for (int i=0; i<=2; i++) {
            System.out.println(tim.getPemain().get(i).getNama());
        }
    }
}
