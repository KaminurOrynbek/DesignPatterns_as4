package Command;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        Command turnTVOn = new TurnTVOn(tv);
        Command setVolume = new SetVolume(stereo, 10);
        Command dimLights = new DimLights(light);

        RemoteControl remote = new RemoteControl();

        remote.addCommand(turnTVOn);
        remote.addCommand(setVolume);
        remote.addCommand(dimLights);

        System.out.println("Pressing buttons on the remote:");
        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressButton(2);

        // Undo last command
        System.out.println("\nPressing undo:");
        remote.pressUndo();
        remote.pressUndo();
        remote.pressUndo();
    }
}
