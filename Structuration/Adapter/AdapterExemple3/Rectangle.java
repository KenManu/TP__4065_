package Structuration.Adapter.AdapterExemple3;

public class Rectangle {

    private float longueur;
    private   float p , A;
    private float largeur;


    public float perimetre(){
        p = (longueur+largeur)*2;
        System.out.println("le perimetre est : " + p);
        return p;
    }
    public float aire(){
        A = longueur*largeur;
        System.out.println("l'aire est:" + A );
        return A;
    }

    public void setLong(float data){
        this.longueur = data;
    }
    public void setLarg(float data){
        this.largeur = data;
    }

}
