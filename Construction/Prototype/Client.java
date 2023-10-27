package Construction.Prototype;


import Construction.Factory2.produitA;
import Construction.Factory2.produitFactory;

public class Client {

    public static void main(String[] args) {

        Person personne1 = new Homme();
        Person personne2 = new Femme();

        Homme personne1Clone = (Homme) personne1.clone();
        Femme personne2Clone = (Femme) personne2.clone();



        personne1.print();
        personne1Clone.print();
        System.out.println("\n");
        personne2.print();
        personne2Clone.print();

    }
}
