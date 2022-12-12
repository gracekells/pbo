import javax.swing.table.DefaultTableModel;

public class Kendaraan {
    
    private String kode, nama, warna, member;
    private int harga, lama;

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

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }
    
    public double getDiskon(){
        double diskon = 0;
        if(member.equals("Ya")){
            diskon = 0.1 * (harga * lama);
        } else {
            diskon = 0;
        }
        return diskon;
    }
    
    public double getTotal(){
        return (harga * lama) - getDiskon();
    }
    
    public DefaultTableModel tampilData(){
        String[] kolom = {
            "Kode",
            "Nama",
            "Warna",
            "Harga",
            "Lama",
            "Total"
        };
        
        DefaultTableModel model = new DefaultTableModel(null, kolom);
        return model;
        
    }
    
}
