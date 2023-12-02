package Structuration.Adapter;

public class AdapterDocumentPdf implements IDocument {

    private Structuration.Adapter.ComposantePdf ComposantePdf;

    public AdapterDocumentPdf(Structuration.Adapter.ComposantePdf ComposantePdf) {
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

