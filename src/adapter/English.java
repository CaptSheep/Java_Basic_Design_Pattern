package adapter;

public class English implements EnglishWord {
    @Override
    public void receive(String word) {
        System.out.println("Translate into English : .......");
        System.out.println(word);
    }
}
