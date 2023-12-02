package Structuration.Bridge.AjoutCouleurForme;

public class Carre extends Shape {
    Carre(Color color) {
        super(color);
    }
    public void colorIt() {
        System.out.print("Carre filled with ");
        color.fillColor();
    }
}