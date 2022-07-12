package patterns.facade.t2;
//遥控器
public class TVController {
    private PowerSystem mPowerSystem = new PowerSystem();
    private VoiceSystem mVoiceSystem = new VoiceSystem();
    private ChannelSystem mChannelSystem = new ChannelSystem();

    public void powerOn() {
        mPowerSystem.powerOn();
    }
    public void powerOff() {
        mPowerSystem.powerOff();
    }
    public void turnUp() {
        mVoiceSystem.turnUp();
    }
    public void turnDown() {
        mVoiceSystem.turnDown();
    }
    public void nextChannel() {
        mChannelSystem.next();
    }
    public void prevChannel() {
        mChannelSystem.prev();
    }

}
