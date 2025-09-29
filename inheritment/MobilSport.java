public class MobilSport extends Mobil implements Serviceable {
    private boolean turbo;

    public MobilSport(String nama, int kecepatan, int jumlahPintu, boolean turbo) {
        super(nama, kecepatan, jumlahPintu);
        this.turbo = turbo;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public void info() {
        System.out.println("Mobil Sport: " + getNama() + ", Turbo: " + (turbo ? "Ya" : "Tidak") +
                           ", Kecepatan: " + getKecepatan() + " km/jam");
    }

    public void service() {
        System.out.println(getNama() + " sedang diservis...");
    }
}
