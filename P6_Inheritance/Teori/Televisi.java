public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi(){
    }

    public void pindahChannel(int channelBaru) {
        if (channelBaru > 0 && channelBaru <= jumlahChannel) {
            channelAktif = channelBaru;
        } else {
            System.out.println("Channel tidak tersedia.");
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}