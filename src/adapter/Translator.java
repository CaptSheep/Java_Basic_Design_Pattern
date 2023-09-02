package adapter;

public class Translator implements VietnameseWord{

     private EnglishWord eng ;

     public Translator(EnglishWord eng){
         this.eng = eng;
     }
    @Override
    public void sendWord(String word) {
        System.out.println("Reading word........");
        System.out.println(word);
        System.out.println("Working on it.......");
        String vietnameseWord = this.translateWord(word);
        eng.receive(vietnameseWord);
    }

    public String translateWord(String word){
        System.out.println("Translate successfully.....");
        return "Hello";
    }
}
