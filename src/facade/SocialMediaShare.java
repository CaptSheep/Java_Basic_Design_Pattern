package facade;

public class SocialMediaShare{
    private FacebookShare facebook ;
    private InstagramShare ins ;

    public SocialMediaShare(FacebookShare facebook, InstagramShare ins) {
        this.facebook = facebook;
        this.ins = ins;
    }

    public void share(String message) {
        this.facebook.setMessage(message);
        this.ins.setMessage(message);

        this.facebook.share();
        this.ins.share();
    }


}
