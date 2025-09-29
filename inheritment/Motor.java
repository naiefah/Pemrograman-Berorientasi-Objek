class Motor extends Kendaraan {
    boolean adaBox;

    public Motor(String merk, int tahun, boolean adaBox) {
        super(merk, tahun);
        this.adaBox = adaBox;
    }

    public void info() {
        super.info();
        System.out.println("Ada Box: " + (adaBox ? "Ya" : "Tidak"));
    }
}
