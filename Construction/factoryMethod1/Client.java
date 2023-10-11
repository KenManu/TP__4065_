package Construction.factoryMethod1;

public class Client {
    public static void main(String[] args) {

        produitFactory produitFactory1 = new produitFactory1();
        produitFactory produitFactory2 = new produitFactory2();

        produitA produitA = null;

        System.out.println("utilisation de la premiere fabrique ");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();


        System.out.println("utilisation de la deuxieme fabrique ");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();


    }
}