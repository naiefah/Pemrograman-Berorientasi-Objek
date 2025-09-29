public class AkunBankTest {

    public static void main(String[] args) {

        AkunBank akunBank1 = new AkunBank(100);
        AkunBank akunBank2 = new AkunBank(9000000);
        AkunBank akunBank3 = new AkunBank(10000000);

        System.out.println("Saldo awal akunBank1 : " + akunBank1.getSaldo());
        akunBank1.menabung(10);
        akunBank1.tarikTunai(50);
        akunBank1.tarikTunai(55); //output akan mengeluarkan pesan yg percabangan kedua
        System.out.println("\nSaldo akhir akunBank1 : " + akunBank1.getSaldo());

        System.out.println("\nSaldo awal akunBank2 : " + akunBank2.getSaldo());
        akunBank2.menabung(500000);
        akunBank2.tarikTunai(1000000);

        System.out.println("\nSaldo awal akunBank3 : " + akunBank3.getSaldo());
        akunBank3.menabung(100000);
        akunBank3.tarikTunai(9900000); 
        akunBank3.tarikTunai(1000000); // Tes kasus saldo melebihi limit atau sampai mijnus
    }
}

