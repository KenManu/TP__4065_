package Construction.Builder2;

public class Directeur {

        MonteurPizzaReine monteurPizzaReine =  new MonteurPizzaReine();
        MonteurPizzaPiquante monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizzaLocale monteurPizzaLocale = new MonteurPizzaLocale();

        public void construire(){

            monteurPizzaReine.creerNouvellePizza();
            monteurPizzaReine.monterPate();
            monteurPizzaReine.monterSauce();
            monteurPizzaReine.monterGarniture();


            monteurPizzaPiquante.creerNouvellePizza();
            monteurPizzaPiquante.monterPate();
            monteurPizzaPiquante.monterSauce();
            monteurPizzaPiquante.monterGarniture();


            monteurPizzaLocale.creerNouvellePizza();
            monteurPizzaLocale.monterPate();
            monteurPizzaLocale.monterSauce();
            monteurPizzaLocale.monterGarniture();
        }

    }

