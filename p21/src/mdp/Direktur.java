
package mdp;
import p21.Karyawan;
import p21.Gaji;
        
public class Direktur extends Karyawan implements Gaji{
    private double gajiPokok;
    private double tunjangan;
    
    public Direktur (String nama){
        super.setNama(nama);
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    //Interface Gaji
    @Override
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double getGajiPokok() {
        return gajiPokok;
    }

    @Override
    public double getTotal() {
        return gajiPokok + tunjangan;
    }         
}
