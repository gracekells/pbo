
public class MenuUtama {
    
    public static void main(String[] args) {
        
        MataKuliah mk1 = new MataKuliah("SI123", "PBO1", 3);
        MataKuliah mk2 = new MataKuliah("SI124", "BDDT", 2);
        
        System.out.println("Mata Kuliah = " + mk1.getKodeMK() + " - " + mk1.getNamaMK() + " - " + mk1.getSks());
        
        System.out.println("Mata Kuliah = " + mk2.getKodeMK() + " - " + mk2.getNamaMK() + " - " + mk2.getSks());
        
        Mahasiswa mhs1 = new Mahasiswa("2024240057", "Grace");
        mhs1.setKodeMK(mk1.getKodeMK());
        mhs1.setNamaMK(mk1.getNamaMK());
        mhs1.setSks(mk1.getSks());
        mhs1.daftarMK();
    }
}
