
public class Karyawan {
    //atribut global
    public String nik;
    public String nama;
    public String jabatan;
    
    //method
    //void = method tanpa nilai balik
    //return = method dengan nilai balik
    
    public int getGaji(){
        int gaji = 0;
        //equals = huruf besar dan kecil harus sama persis
        //equalsIgnoreCase = huruf besar dan kecil tidak diperhatikan
        if (jabatan.equalsIgnoreCase("Manajer")){
            gaji = 10000000;
        } else if (jabatan.equalsIgnoreCase("SPV")){
            gaji = 7000000;
        } else if (jabatan.equalsIgnoreCase("Staff")){
            gaji = 5000000;
        } else {
            gaji = 0;
        }
        return gaji;     
    }
    
    public int getTunjangan(){
        int tunjangan = 0;
        if (jabatan.equalsIgnoreCase("Manajer")){
            tunjangan = 5000000;
        } else if (jabatan.equalsIgnoreCase("SPV")){
            tunjangan = 2000000;
        } else{
            tunjangan = 0;
        }
        return tunjangan; 
    }
    
    public int getTotalGaji(){
        return getGaji() + getTunjangan();
    } 
    
    public void tampilData(){
        System.out.println("NIK \t\t= " + nik);
        System.out.println("Nama \t\t= " + nama);
        System.out.println("Jabatan \t= " + jabatan);
        System.out.println("Gaji \t\t= " + getGaji());
        System.out.println("Tunjangan \t= " + getTunjangan());
        System.out.println("Total Gaji \t= " + getTotalGaji());
    }
    
}
