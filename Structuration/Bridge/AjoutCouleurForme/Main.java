package Structuration.Bridge.AjoutCouleurForme;

public class Main {
    public static void main(String[] args) {
        Shape s1=new Rectangle(new RedColor());
        s1.colorIt();
        Shape s2=new Circle(new BlueColor());
        s2.colorIt();
        Shape s3=new Carre(new GreenColor());
        s3.colorIt();
    }
}