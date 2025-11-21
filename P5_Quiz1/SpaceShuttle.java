package P5_Quiz1;

public class SpaceShuttle {
    private String Kode;
    private int Berat;
    private Roket RoketUtama;
    private Generator GeneratorUtama;

    public SpaceShuttle (String kd, int brt, Roket rkt, Generator gnt){
        Kode = kd;
        Berat = brt;
        RoketUtama = rkt;
        GeneratorUtama = gnt;
    }

    public String getKode() { 
        return Kode; 
    }

    public int getBerat() { 
        return Berat; 
    }

    public Roket getRoketUtama(){
        return RoketUtama;
    }

    public Generator getGeneratorUtama(){
        return GeneratorUtama;
    }

    public void setKode(String kode) { 
        Kode = kode; 
    }

    public void setBerat(int brt) { 
        Berat = brt; 
    }

    public void setRoketUtama(Roket rkt){
        RoketUtama = rkt;
    }

    public void setGeneratorUtama(Generator gnt){
        GeneratorUtama = gnt;
    }
}
