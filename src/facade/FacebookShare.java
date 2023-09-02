package facade;

public class FacebookShare implements IShare{
    private String message;
    @Override
    public void share() {
        System.out.println("Facebook sharing message : " + message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
