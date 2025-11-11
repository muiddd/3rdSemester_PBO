public class Transaksi {
    private String id;
    private Motor motor;
    private Pelanggan pelanggan;
    private Petugas petugas;
    private int hari;

    public Transaksi(String id, Motor motor, Pelanggan pelanggan, Petugas petugas, int hari) {
        this.id = id;
        this.motor = motor;
        this.pelanggan = pelanggan;
        this.petugas = petugas;
        this.hari = hari;
    }

    public int hitungTotal() {
        return motor.getBiaya() * hari;
    }

    public String info() {
        String info = "=== Data Transaksi ===\n";
        info += "ID Transaksi: " + id + "\n";
        info += pelanggan.info();
        info += motor.info();
        info += petugas.info();
        info += "Lama Sewa: " + hari + " hari\n";
        info += "Total Biaya: " + hitungTotal() + "\n";
        return info;
    }
}
