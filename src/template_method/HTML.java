package template_method;

public class HTML extends Page{
    @Override
    void printHeader() {
        System.out.println("This is HTML Header");
    }

    @Override
    void printBody() {
        System.out.println("This is HTML Body");
    }

    @Override
    void printFooter() {
        System.out.println("This is HTML Footer");
    }
}
