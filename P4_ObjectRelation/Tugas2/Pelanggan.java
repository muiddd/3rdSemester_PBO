public class Pelanggan {
    private String id;
    private String nama;

    public Pelanggan(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String info() {
        return "ID Pelanggan: " + id + "\n" +
               "Nama Pelanggan: " + nama + "\n";
    }
}
