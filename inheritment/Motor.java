public class Motor extends Kendaraan {
    private String jenisHelm;

    public Motor(String nama, int kecepatan, String jenisHelm) {
        super(nama, kecepatan);
        this.jenisHelm = jenisHelm;
    }

    public String getJenisHelm() {
        return jenisHelm;
    }

    public void setJenisHelm(String jenisHelm) {
        this.jenisHelm = jenisHelm;
    }

    @Override
    public void info() {
        System.out.println("Motor: " + getNama() + ", Helm: " + jenisHelm +
                           ", Kecepatan: " + getKecepatan() + " km/jam");
    }
}
