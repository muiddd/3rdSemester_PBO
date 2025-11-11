public class MainManusia {
    public static void main(String[] args) {
        Manusia m1;

        m1 = new Dosen();
        m1.bernafas();
        m1.makan();

        System.out.println("--------------------------------------------");

        m1 = new Mahasiswa();
        m1.bernafas();
        m1.makan();
    }
}
