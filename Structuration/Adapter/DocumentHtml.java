package Structuration.Adapter;


public class DocumentHtml implements IDocument {

    @Override

    public void setContenu(){
        System.out.println("appel de l'impression du document HTML");
    }
    public void dessine (){
        System.out.println("dessin du document HTML");
    }
    public void imprime(){
        System.out.println("impression du document HTML");
    }
}
