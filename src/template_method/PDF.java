package template_method;

public class PDF extends Page{
    @Override
    void printHeader() {
        System.out.println("This is PDF Header");
    }

    @Override
    void printBody() {
        System.out.println("This is PDF Body");
    }

    @Override
    void printFooter() {
        System.out.println("This is PDF Footer");
    }
}
