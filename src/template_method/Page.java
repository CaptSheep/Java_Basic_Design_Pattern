package template_method;

public abstract class Page {

    void print(){
        System.out.println("===========================");
        printHeader();
        printBody();
        printFooter();
        System.out.println("===========================");

    };

    abstract void printHeader();
    abstract void printBody();
    abstract void printFooter();
}
