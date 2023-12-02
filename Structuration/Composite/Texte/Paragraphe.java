package Structuration.Composite.Texte;

import java.util.ArrayList;

public class Paragraphe extends Texte {
        ArrayList<Texte> texte = new ArrayList<Texte>();

        public int longueur(){
            return texte.size();
        };
        public void ajout(Texte txt){
            texte.add(txt);
        };
        public void retrait(int index){
            texte.remove(index);
        };
        public void print(){
            System.out.println("Texte de type Paragraphe\n de taille "+texte.size());
        }
}
