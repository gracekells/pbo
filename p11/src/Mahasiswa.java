public class Mahasiswa {
    //akses modifier
    //1. public = dapat diakses di semua class
    //2. private = hanya dapat diakses di class itu sendiri
    //3. protected = hanya dapat diakses di class itu sendiri dan turunannya
    //4. default = hanya dapat diakses di package yg sama

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

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    private String npm, nama;
    private int umur;
    
    public void tampilData(){
        System.out.println("NPM \t= " + npm);
        System.out.println("Nama \t= " + nama);
        System.out.println("Umur = \t" + umur);
    }
}
