package Construction.Prototype;

public class Homme implements Person{
    private final String genre = "Homme";

    @Override
    public Person clone(){
        return  new Homme();
    }

    public void print() {
        System.out.println("je suis une personne de genre = " + genre);
    }

}
