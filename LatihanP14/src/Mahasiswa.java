
public class Mahasiswa {
    
    private String npm, nama;
    
    private String[] kodeMK = new String[2];
    private String[] namaMK = new String[2];
    private int[] sks = new int [2];
    private int jumlahMK = 0;
    
    Mahasiswa(String npm, String nama){
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String[] getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK[jumlahMK] = kodeMK;
        jumlahMK++;
    }

    public String[] getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK[jumlahMK] = namaMK;
//        jumlahMK++;
    }

    public int[] getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks[jumlahMK] = sks;
//        jumlahMK++; 
    }

    public int getJumlahMK() {
        return jumlahMK;
    }

    public void setJumlahMK(int jumlahMK) {
        this.jumlahMK = jumlahMK;
    }
    
    public void daftarMK(){
        System.out.println("NPM \t= " + npm);
        System.out.println("Nama \t= " + nama);
        System.out.println("Daftar MataKuliah yang Diambil = ");
        
        for (int i=0; i<jumlahMK; i ++){
            System.out.println(kodeMK[i] + " - " + namaMK[i] + " - " + sks[i]);
        }
    } 
}
