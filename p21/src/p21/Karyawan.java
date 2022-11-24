package p21;

public abstract class Karyawan implements Biodata{
    private String nik;
    private String nama;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
    //Interface Biodata
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }
}
