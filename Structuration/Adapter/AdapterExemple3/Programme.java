package Structuration.Adapter.AdapterExemple3;

public class Programme {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        ICarre recta = new AdaptRectangle(rect);
        float cote = 3;
        recta.perimetre(cote);
        recta.aire(cote);


    }
}
