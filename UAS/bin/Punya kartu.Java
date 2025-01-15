class PelangganDenganKartuDiskon extends Diskon {
    @Override
    public double hitungPotongan(double totalBelanja) {
        if (totalBelanja > 500000) {
            return 0.10;
        } else if (totalBelanja >= 100000) {
            return 0.05;
        } else {
            return 0.03;
        }
    }
}