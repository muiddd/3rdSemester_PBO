public class Dekstop extends Komputer {
    protected String Printer;

    public Dekstop(String merk, int memory, int cpu, String printer){
        super(merk, memory, cpu);
        Printer = printer;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Printer: " + Printer);
    }
}
