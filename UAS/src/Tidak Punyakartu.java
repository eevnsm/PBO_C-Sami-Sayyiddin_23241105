class PelangganTanpaKartuDiskon extends Diskon {
    @Override
    public double hitungPotongan(double totalBelanja) {
        if (totalBelanja > 100000) {
            return 0.03;
        } else {
            return 0.0;
        }
    }
}