public class Pasien {
    private String idPasien;
    private String nama;

    public Pasien(String idPasien, String nama) {
        this.idPasien = idPasien;
        this.nama = nama;
    }

    public String getIdPasien() { 
        return idPasien; 
    }

    public String getNama() {
        return nama; 
    }

    public void setIdPasien(String idPasien) { 
        this.idPasien = idPasien; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String info() {
        return "Pasien[ID=" + idPasien + ", Nama=" + nama + "]";
    }
}
