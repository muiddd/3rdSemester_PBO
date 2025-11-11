package P5_Kuis;
public class Roket {
    private String Tipe;
    private int Power;

    public Roket (String tipe, int pwr){
        Tipe = tipe;
        Power = pwr;
    }

    public String getTipe() { 
        return Tipe; 
    }

    public int getPower() { 
        return Power; 
    }

    public void setTipe(String tipe) { 
        Tipe = tipe; 
    }

    public void setPower(int pwr) { 
        Power = pwr; 
    }
}
