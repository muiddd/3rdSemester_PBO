package Tugas;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    private int jumlahPegawai; 

    public DaftarGaji(int kapasitas) {
        this.listPegawai = new Pegawai[kapasitas];
        this.jumlahPegawai = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            this.listPegawai[jumlahPegawai] = pegawai;
            this.jumlahPegawai++;
        } else {
            System.out.println("Kapasitas daftar gaji sudah penuh!");
        }
    }

    public void printSemuaGaji() {
        System.out.println("===== LAPORAN GAJI PEGAWAI =====");
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Nama    : " + listPegawai[i].getNama());
            System.out.println("Gaji    : Rp " + listPegawai[i].getGaji());
            System.out.println("--------------------------------");
        }
    }
}
