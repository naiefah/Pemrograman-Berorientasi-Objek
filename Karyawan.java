class Karyawan {
    public String nama;        // bisa diakses dari mana saja
    private double gaji;       // hanya bisa diakses di class ini
    static int jumlahKaryawan; // milik class, bukan objek
    final String perusahaan = "PT. Informatika"; // tidak bisa diubah

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
        jumlahKaryawan++;
    }

    public double getGaji() {
        return gaji;
    }
}
