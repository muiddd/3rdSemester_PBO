public class Main {
    public static void main(String[] args) {
        Motor m1 = new Motor("Honda Vario", 80000);
        Pelanggan p1 = new Pelanggan("C001", "Andi");
        Petugas t1 = new Petugas("P001", "Rina");

        Transaksi tr1 = new Transaksi("T001", m1, p1, t1, 3);

        System.out.println(tr1.info());
    }
}