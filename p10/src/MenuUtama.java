
public class MenuUtama {

    public static void main(String[] args) {
        Karyawan kry1 = new Karyawan ();
        kry1.nik = "12345";
        kry1.nama = "Grace";
        kry1.jabatan = "Manajer";
        
        System.out.println("");
        System.out.println("Data Karyawan 1");
        kry1.tampilData();
        
        Karyawan kry2 = new Karyawan();
        kry2.nik = "23456";
        kry2.nama = "Kelly";
        kry2.jabatan = "SPV";
        
        System.out.println("");
        System.out.println("Data Karyawan 2");
        kry2.tampilData();
        
        Karyawan kry3 = new Karyawan();
        kry3.nik = "56789";
        kry3.nama = "Suryadinatan";
        kry3.jabatan = "Staff";
        
        System.out.println("");
        System.out.println("Data Karyawan 3");
        kry3.tampilData();

    }
    
}
