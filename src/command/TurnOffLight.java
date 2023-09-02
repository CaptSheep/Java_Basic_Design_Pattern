package command;

public class TurnOffLight implements ICommand{

    private Light light ;

    public void turnOffLight(Light light){
       this.light = light;
    }
    @Override
    public void execute() {
        this.light.turnOff();
    }
}
