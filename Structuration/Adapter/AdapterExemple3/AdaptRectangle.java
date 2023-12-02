package Structuration.Adapter.AdapterExemple3;

public class AdaptRectangle implements  ICarre{
    private Rectangle rectangle;

    public AdaptRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    @Override
    public float perimetre(float cote){
        rectangle.setLong(cote);
        rectangle.setLarg(cote);
        return rectangle.perimetre();
    }

    public float aire(float cote){
        rectangle.setLong(cote);
        rectangle.setLarg(cote);
        return  rectangle.aire();
    }
}
