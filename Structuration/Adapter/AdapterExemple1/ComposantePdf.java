package Structuration.Adapter.AdapterExemple1;

public class ComposantePdf {

    public void pdfFixeContenu(){
        System.out.println(" contenu du document pdf");
    }
    public void pdfPrepareAffichage(){
    System.out.println("preparation affichage du contenu pdf");
    }

    public void pdfRafraichir(){
        System.out.println("rafraichissement du document pdf");
    }

    public void pdfTermineAffichage(){
        System.out.println(" Document pdf pdf a terminer son affichage");
    }

    public void pdfEnvoieImprimante(){
        System.out.println(" envoi du document pdf a l'imprimante");
    }

}
