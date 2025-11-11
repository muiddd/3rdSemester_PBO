public class Main {
    public static void main(String[] args) {
        // buat objek Pasien
        Pasien pasien1 = new Pasien("P001", "Budi");

        // buat objek Dokter
        Dokter dokter1 = new Dokter("D001", "dr. Siti");

        // buat objek Obat
        Obat obat1 = new Obat("Paracetamol", 15000);

        // buat objek RekamMedis (relasi antara pasien, dokter, dan obat)
        RekamMedis rm1 = new RekamMedis("RM001", pasien1, dokter1, obat1, "Demam");

        // tampilkan informasi rekam medis
        System.out.println(rm1.info());
    }
}