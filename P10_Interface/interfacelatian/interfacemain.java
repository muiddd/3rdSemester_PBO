package interfacelatian;

import interfacelatian.Mahasiswa;
import interfacelatian.PascaSarjana;
import interfacelatian.Rektor;
import interfacelatian.Sarjana;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        //pakRektor.beriSertifikatCumlaude(mhsBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
