package command;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();

        ICommand iCommand = new TurnOnLight(light);
        remoteControl.setCommand(iCommand);
        remoteControl.clickButton();
        System.out.println(light);
    }
}
