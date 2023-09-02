package facade;

public class InstagramShare implements IShare{
    private String message;
    @Override
    public void share() {
        System.out.println("Instagram sharing message : " + message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
