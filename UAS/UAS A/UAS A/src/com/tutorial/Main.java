public class Niaga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Apakah pelanggan memiliki kartu member? (ya/tidak): ");
        String statusMemberInput = scanner.nextLine();
        boolean memilikiMember = statusMemberInput.equalsIgnoreCase("ya");

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = scanner.nextDouble();

        Pelanggan pelanggan = new Pelanggan(namaPelanggan, totalBelanja);
        Diskon diskon;

        if (memilikiMember) {
            diskon = new PelangganDenganKartuDiskon();
        } else {
            diskon = new PelangganTanpaKartuDiskon();
        }

        double potongan = diskon.hitungPotongan(totalBelanja);
        double totalSetelahPotongan = diskon.hitungTotalSetelahPotongan(totalBelanja, potongan);
        double jumlahDiskon = totalBelanja * potongan;

        System.out.println("\n===== Rincian Belanja =====");
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Status Member: " + (memilikiMember ? "Ya" : "Tidak"));
        System.out.println("Total Belanja Sebelum Potongan: Rp " + String.format("%.2f", pelanggan.getTotalBelanja()));
        System.out.println("Diskon: " + (int)(potongan * 100) + "%");
        System.out.println("Jumlah Diskon: Rp " + String.format("%.2f", jumlahDiskon));
        System.out.println("Total Belanja Setelah Potongan: Rp " + String.format("%.2f", totalSetelahPotongan));

        scanner.close();
    }
}
