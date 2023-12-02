package Structuration.Adapter.AdapterExemple1;

public class ServeurWeb {
    public static void main(String[] args) {
        IDocument html = new DocumentHtml();
        html.setContenu();
        html.dessine();
        html.imprime();

        ComposantePdf Pdf = new ComposantePdf();
        IDocument PDF = new AdapterDocumentPdf(Pdf);
        PDF.setContenu();
        PDF.dessine();
        PDF.imprime();

    }
}