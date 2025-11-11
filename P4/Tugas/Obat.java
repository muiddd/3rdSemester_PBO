public class Obat {
    private String nama;
    private int harga;

    public Obat(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { 
        return nama; 
    }

    public int getHarga() { 
        return harga; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setHarga(int harga) { 
        this.harga = harga; 
    }

    public String info() {
        return "Obat[Nama=" + nama + ", Harga=" + harga + "]";
    }
}
