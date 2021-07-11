package command_pattern;

public class Stereo {
    public void on(){
        System.out.printf("Stereo is on\n");
    }

    public void off(){
        System.out.printf("Stereo is off\n");
    }

    public void setCD(){
        System.out.printf("Stereo is set for CD input\n");
    }

    public void setDVD(){
        System.out.printf("Stereo is set for DVD input\n");
    }

    public void setRadio(){
        System.out.printf("Stereo is set for Radio\n");
    }

    public void setVolume(int volume){
        System.out.printf("Stereo volume set %d\n",volume);
    }

}
