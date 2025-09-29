public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void info() {
        System.out.println("Mobil: " + getNama() + ", Pintu: " + jumlahPintu +
                           ", Kecepatan: " + getKecepatan() + " km/jam");
    }
}
