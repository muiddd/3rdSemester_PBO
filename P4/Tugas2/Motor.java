public class Motor {
    private String merk;
    private int biaya;

    public Motor(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    public String getMerk() { return merk; }
    public int getBiaya() { return biaya; }

    public String info() {
        return "Merk Motor: " + merk + "\n" +
               "Biaya per Hari: " + biaya + "\n";
    }
}