import javax.swing.table.DefaultTableModel;

public class Barang {
    private String kode;
    private String nama;
    private String jenis;
    private String kondisi;
    private int harga;
    private int jumlah;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public DefaultTableModel tampilBarang(){
        //nama kolom
        String[] kolom = {
            "Kode",
            "Nama",
            "Jenis",
            "Kondisi",
            "Harga",
            "Jumlah"
        };
        
        DefaultTableModel model = new DefaultTableModel(null, kolom);
        return model;
    }
    
    
}
