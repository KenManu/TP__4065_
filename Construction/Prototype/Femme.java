package Construction.Prototype;

public class Femme implements Person{

    private final String genre = "Femme";
    @Override
    public Person clone(){
        return  new Femme();
    }

    public void print() {
        System.out.println("je suis une personne de genre = " + genre);
    }

}
