package q6;

public class Main {
    public static void main(String[] args) {
        Document pdf = new PdfDocument();
        Document html = new HtmlDocument();
        Document unknown = new UnknownDocument();

        pdf.print();
        html.print();
        unknown.print();
    }
}

