package command_pattern;

public class StereoOnWithCDCommand  implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void excute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(25);
    }
}
