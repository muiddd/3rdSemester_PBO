public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut dengan satu parameter: " + segitiga.totalSudut(60));
        System.out.println("Total sudut dengan dua parameter: " + segitiga.totalSudut(60, 30));
        
        System.out.println("------------------------------------");

        System.out.println("Keliling dengan tiga parameter: " + segitiga.keliling(10, 12, 15));
        System.out.println("Sisi miring (keliling 2 parameter): " + segitiga.keliling(10, 12));
    }
}
