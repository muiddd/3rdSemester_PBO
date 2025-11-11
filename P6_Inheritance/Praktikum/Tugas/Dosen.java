package Tugas;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int TARIF_SKS = 120000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        int gajiTotal = super.getGaji() + (this.jumlahSKS * this.TARIF_SKS);
        return gajiTotal;
    }
}