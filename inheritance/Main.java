public class Main {
    public static void main(String[] args) {
        // Single Inheritance
        Mobil m1 = new Mobil("Avanza", 120, 4);
        m1.info();

        // Multilevel + Hybrid
        MobilSport ms = new MobilSport("Ferrari", 300, 2, true);
        ms.info();
        ms.service();

        // Hierarchical
        Motor motor1 = new Motor("Vario", 90, "Full Face");
        motor1.info();
    }
}
