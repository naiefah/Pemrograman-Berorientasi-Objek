public class AkunBank {
    
    private int saldo;

    public AkunBank (int saldo){
        this.saldo = saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

   public void menabung(int jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Berhasil menabung " + jumlah + ". Saldo sekarang: " + this.saldo);
        } else {
            System.out.println("Jumlah tabungan harus lebih dari 0!");
        }
    }

    public void tarikTunai(int jumlah){
        if(this.saldo - jumlah <= 0){
            System.out.println("Penarikan tidak boleh membuat saldo menjadi menjadi habis atau 0");
        } else if(this.saldo - jumlah < 10){
            System.out.println("Penarikan gagal. Saldo harus tersisa minimal 10. Saldo sekarang: " + this.saldo);
        } else {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik tunai " + jumlah + ". Saldo sekarang: " + this.saldo);
        }
    }
}


