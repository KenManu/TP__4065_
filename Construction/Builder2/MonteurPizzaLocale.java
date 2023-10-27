package Construction.Builder2;

public class MonteurPizzaLocale extends MonteurPizza {

    public void monterPate() { pizza.setPate("feuille de macabo"); }
    public void monterSauce() { pizza.setSauce("sauce jaune"); }
    public void monterGarniture() { pizza.setGarniture("escargot");
    }
    public Pizza getPizza() { return pizza; }
}