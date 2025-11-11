public class TelevisiModern extends Televisi {
    private String modusTampilan;
    private String dvd;

    public TelevisiModern(String mrk, int jmlChannel) {
        merek = mrk;
        jumlahChannel = jmlChannel;
        modusTampilan = "Televisi";
        super.pindahChannel(1); 
        this.dvd = "kosong";
    }

    public void masukkanDVD(String judulDVD) {
        this.dvd = judulDVD;
    }

    public void gantiModusTampilan(String modus) {
        modusTampilan = modus;
    }

    public void mainkanDVD() {
        if (dvd.equals("kosong")) {
            System.out.println("Sedang memainkan DVD: kosong");
        } else {
            System.out.println("Sedang memainkan DVD: " + this.dvd);
        }
    }
}