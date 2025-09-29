public class KaryawanTest {
    public static void main(String[] args) {
        // Membuat objek Karyawan dengan constructor berparameter
        Karyawan k1 = new Karyawan("Naiefah Fawwaztiyani", 9000000);
        Karyawan k2 = new Karyawan("Fawwaztiyani Naiefah", 4000000);

        // Menampilkan data karyawan pertama
        System.out.println("=== Data Karyawan 1 ===");
        System.out.println("Nama        : " + k1.nama);
        System.out.println("Gaji        : " + k1.getGaji());
        System.out.println("Perusahaan  : " + k1.perusahaan);

        // Menampilkan data karyawan kedua
        System.out.println("\n=== Data Karyawan 2 ===");
        System.out.println("Nama        : " + k2.nama);
        System.out.println("Gaji        : " + k2.getGaji());
        System.out.println("Perusahaan  : " + k2.perusahaan);

        // Menampilkan jumlah total karyawan (static variable)
        System.out.println("\nJumlah karyawan saat ini: " + Karyawan.jumlahKaryawan);
    }
}
