package command;

public class RemoteControl {
    private  ICommand iCommand;

    public void setCommand(ICommand iCommand){
        this.iCommand = iCommand;
    }
    public void clickButton(){
        this.iCommand.execute();
    }
}
