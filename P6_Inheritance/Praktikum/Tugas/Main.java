package Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(3);

        Dosen d1 = new Dosen("112233", "Budi Wijaya", "Jl. Soekarno Hatta, Malang");
        d1.setSKS(8);

        Dosen d2 = new Dosen("445566", "Rina Astuti", "Jl. Veteran, Malang");
        d2.setSKS(6);

        daftar.addPegawai(d1);
        daftar.addPegawai(d2);

        daftar.printSemuaGaji();
    }
}
