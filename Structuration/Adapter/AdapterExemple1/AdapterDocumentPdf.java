package Structuration.Adapter.AdapterExemple1;

public class AdapterDocumentPdf implements IDocument {

    private ComposantePdf ComposantePdf;

    public AdapterDocumentPdf(ComposantePdf ComposantePdf) {
        this.ComposantePdf = ComposantePdf;
    }

    public void setContenu() {
        ComposantePdf.pdfFixeContenu();
    }

    public void dessine() {
        ComposantePdf.pdfPrepareAffichage();
        ComposantePdf.pdfRafraichir();
        ComposantePdf.pdfTermineAffichage();

           }


    public void imprime() {
        System.out.print("imprime() appel ");
        ComposantePdf.pdfEnvoieImprimante();
    }

}

