package P5_Kuis;

public class Generator {
    private int Daya;
    private int Voltase;

    public Generator (int dy, int volt){
        Daya = dy;
        Voltase = volt;
    }

    public int getDaya() { 
        return Daya; 
    }

    public int getVoltase() { 
        return Voltase; 
    }

    public void setDaya(int dy) { 
        Daya = dy; 
    }

    public void setVoltase(int volt) { 
        Voltase = volt; 
    }
}
