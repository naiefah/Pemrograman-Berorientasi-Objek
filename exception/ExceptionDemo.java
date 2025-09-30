package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Contoh Exception: pembagian dengan nol
            int hasil = 10 / 0;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }

        // Contoh Exception lain dengan throw
        try {
            cekUmur(15);  // umur < 18 akan lempar exception
        } catch (Exception e) {
            System.out.println("Terjadi Exception: " + e.getMessage());
        }
    }

    // Method dengan throws
    public static void cekUmur(int umur) throws Exception {
        if (umur < 18) {
            throw new Exception("Umur belum cukup untuk mendaftar!");
        } else {
            System.out.println("Selamat, Anda bisa mendaftar.");
        }
    }
}
