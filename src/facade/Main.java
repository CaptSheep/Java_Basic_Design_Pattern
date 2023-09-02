package facade;

public class Main {
    public static void main(String[] args) {
        FacebookShare face = new FacebookShare();
        InstagramShare ins = new InstagramShare();
        SocialMediaShare socialMediaShare = new SocialMediaShare(face,ins);
        socialMediaShare.share("Hello");
    }
}
