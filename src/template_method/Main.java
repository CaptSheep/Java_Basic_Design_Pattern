package template_method;

public class Main {
    public static void main(String[] args) {
        HTML html = new HTML();
        PDF pdf = new PDF();
        html.print();
        pdf.print();
    }
}
