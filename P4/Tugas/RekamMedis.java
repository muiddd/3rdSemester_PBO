public class RekamMedis {
    private String id;
    private Pasien pasien;
    private Dokter dokter;
    private Obat obat;
    private String diagnosa;

    public RekamMedis(String id, Pasien pasien, Dokter dokter, Obat obat, String diagnosa) {
        this.id = id;
        this.pasien = pasien;
        this.dokter = dokter;
        this.obat = obat;
        this.diagnosa = diagnosa;
    }

    public String info() {
        return "RekamMedis[ID=" + id + "]\n" +
               pasien.info() + "\n" +
               dokter.info() + "\n" +
               obat.info() + "\n" +
               "Diagnosa: " + diagnosa;
    }
}