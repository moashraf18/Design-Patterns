public class Main {
    public static void main(String[] args) {

        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);

        RemoteController remote = new RemoteController();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(volumeUp);
        remote.pressButton();

        remote.setCommand(volumeUp);
        remote.pressButton();

        remote.setCommand(volumeDown);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}