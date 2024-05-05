package tv;
public class tvMain {
    public static void main(String [] args) {
        TV t1 = new TV();
        t1.turnon();
        t1.setChannel(5);
        t1.setVolumeLevel(8);
        t1.channelDown();
        t1.VolumeDown();
    }}
