public class Motor {
    private String merk;
    private int biaya;

    public Motor(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    public Motor() {
        //TODO Auto-generated constructor stub
    }

    public String getMerk() { return merk; }
    public int getBiaya() { return biaya; }

    public String info() {
        return "Merk Motor: " + merk + "\n" +
               "Biaya per Hari: " + biaya + "\n";
    }

    public void printStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printStatus'");
    }

    public void tambahKecepatan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tambahKecepatan'");
    }

    public void nyalakanMesin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nyalakanMesin'");
    }

    public void matikanMesin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'matikanMesin'");
    }
}