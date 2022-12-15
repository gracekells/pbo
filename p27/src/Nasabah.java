import javax.swing.table.DefaultTableModel;

public class Nasabah {
    private String noRekening, nama, jenisKelamin, alamat, noHp;

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    
    public DefaultTableModel tampilNasabah(){
        String[] kolom = {
            "No Rekening",
            "Nama",
            "Jenis Kelamin",
            "Alamat",
            "No HP"
        };
        DefaultTableModel model = new DefaultTableModel (null, kolom);
        return model;
    }
}
