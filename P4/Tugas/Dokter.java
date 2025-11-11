public class Dokter {
    private String idDokter;
    private String nama;

    public Dokter(String idDokter, String nama) {
        this.idDokter = idDokter;
        this.nama = nama;
    }

    public String getIdDokter() { 
        return idDokter; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setIdDokter(String idDokter) { 
        this.idDokter = idDokter; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String info() {
        return "Dokter[ID=" + idDokter + ", Nama=" + nama + "]";
    }
}
