public class Kendaraan {
    protected String nama; // protected bisa diakses oleh subclass
    private int kecepatan; // encapsulation (hanya setter & getter)

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (kecepatan >= 0) {
            this.kecepatan = kecepatan;
        }
    }

    public void info() {
        System.out.println("Kendaraan: " + nama + ", Kecepatan: " + kecepatan + " km/jam");
    }
}
