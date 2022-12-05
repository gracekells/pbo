
public class Mahasiswa {
    private String npm;
    private String nama;
    private String prodi;

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
    
    public void tampilMahasiswa(){
        System.out.println("NPM \t= " + npm);
        System.out.println("Nama \t= " + nama);
        System.out.println("Prodi \t= " + prodi);
              
    }
            
}
