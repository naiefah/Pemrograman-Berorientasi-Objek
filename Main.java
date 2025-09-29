public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 2020, 4);
        Motor motor1 = new Motor("Honda", 2018, true);

        System.out.println("=== Info Mobil ===");
        mobil1.info();

        System.out.println("\n=== Info Motor ===");
        motor1.info();
    }
}