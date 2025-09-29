class Kendaraan {
    String merk;
    int tahun;

    // Constructor
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Method
    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}