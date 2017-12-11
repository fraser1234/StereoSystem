public class Stereo extends Component implements IPeripheral {

    String name;
    int volume;
    int maxVolume;

    public Stereo(String make, String model, String name) {
        super(make, model);
        this.name = name;
        this.volume = 0;
        this.maxVolume = 10;
    }

    public String play(String string) {
        return string;
    }

    public int getCurrentVolume(){
        return 0;
    }

    public void raiseVolume(){
        if(this.volume <maxVolume){
            this.volume++;
        }
    }

    public void lowerVolume(){
        if(this.volume > 0){
            this.volume--;
        }
    }


}
