import javax.swing.JOptionPane;

public class Mahasiswa {
    private String npm;
    private String nama;
    private String prodi;
    private String hobi;  

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

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    
    
    public void tampilMahasiswa(){
        JOptionPane.showMessageDialog(null, 
                "NPM \t= " + npm + "\n" + 
                "Nama \t= " + nama + "\n" + 
                "Prodi \t= " + prodi + "\n" + 
                "Hobi \t= " + hobi);
//        System.out.println("NPM \t= " + npm);
//        System.out.println("Nama \t= " + nama);
//        System.out.println("Prodi \t= " + prodi);
              
    }
            
}
