package command;

public class Light {
    private boolean status;

   public void turnOff(){
       this.status = false;

   }
   public void turnOn(){
       this.status = true;
   }

   public String toString(){
       return "Status : " + (this.status ? "ON" : "OFF");
   }

}
