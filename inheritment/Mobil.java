class Mobil extends Kendaraan {
    int jumlahPintu;

    // Constructor
    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun); // memanggil constructor dari class induk
        this.jumlahPintu = jumlahPintu;
    }

    public void info() {
        super.info(); // memanggil method dari class induk
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}