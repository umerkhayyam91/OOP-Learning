public class TV {

    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel <= 1 && newChannel >= 120) {
            channel = newChannel;
        }

    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 7) {
            volume = newVolume;
        }
    }

    public void volumeUp() {
        if (on && volume < 7) {
            volume++;
        }
    }

    public void volumeDown() {
        if (on && volume < 7) {
            volume++;
        }
    }

    public void channelUp() {
        if (on && volume < 7) {
            volume++;
        }
    }

    public void channelDown() {
        if (on && volume < 7) {
            volume++;
        }
    }
}