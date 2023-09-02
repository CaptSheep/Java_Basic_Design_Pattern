package adapter;

public class Main  {
    public static void main(String[] args) {
        VietnameseWord vietnamese = new Translator(new English());
        vietnamese.sendWord("Xin chao");
    }
}
