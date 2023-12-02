package Structuration.Composite.Repertoire;

public class Client {
    public static void main(String[] args) {
        Systeme pdf = new Fichier("pdf","pdf");
        Systeme txt = new Fichier("texte","txt");
        Systeme dossier1 = new Dossier("Composite1","dossier");
        Systeme dossier2 = new Dossier("Composite2","dossier");

        System.out.println("test de fichier");
        pdf.decrire();
        txt.decrire();
        System.out.println("");

        System.out.println("test de dossier");
        dossier1.ajouter(dossier2);
        dossier1.ajouter(pdf);
        dossier1.ajouter(txt);
        dossier1.decrire();

    }
}
