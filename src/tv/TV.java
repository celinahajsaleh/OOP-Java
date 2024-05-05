package tv;
public class TV {
    private int channel;
    private int VolumeLevel;
    boolean on;
    public TV() {
        this.on = false;
    }
  public void turnon() {
        if(on)
            System.out.println("this tv is already on!");
        else
            this.on= on;}
    public void turnoff() {
        if(!on)
            System.out.println("this tv is already off!");
        else
            this.on= false;}
    public void setChannel(int channel) {
        if(on){
        if(channel>0 && channel<=120){
        this.channel = channel;}
        else{
            System.out.println("Channel not found!");
        }}
        else System.out.println("make sure u are turning on this tv");
    }
    public void setVolumeLevel(int level) {
        if(on){
        if(level>0 && level<=7){
            this.VolumeLevel = level;}
        else{
            System.out.println("U can only set Volume level bet. 1 to 7!!");
        }}
        else System.out.println("make sure u are turning on this tv");
    }
    public void channelUp(){
        if(channel<120)
            this.channel++;
    else
            System.out.println("there's no channels");}
    public void channelDown(){
        if(channel>1)
            this.channel--;
        else
            System.out.println("there's no channels");
    }
    public void VolumeUp(){
        if(VolumeLevel<7)
            this.VolumeLevel++;
        else
            System.out.println("U cant level up");
    }
    public void VolumeDown(){
        if(VolumeLevel<1)
        this.VolumeLevel--;
        else
            System.out.println("U cant level up");
    }
}

