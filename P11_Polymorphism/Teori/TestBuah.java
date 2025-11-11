public class TestBuah {
    public static void main(String[] args) {
        Manusia ilham = new Manusia();

        Apel myApel = new Apel();
        Pisang myPisang = new Pisang();
        Durian myDurian = new Durian();

        ilham.MakanBuah(myPisang);
        ilham.MakanBuah(myDurian);
        ilham.MakanBuah(myApel);
    }
}
