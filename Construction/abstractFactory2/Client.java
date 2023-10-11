package Construction.abstractFactory2;

public class Client {
    public static void main(String[] args) {

        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();
        IProduitFactory produitFactory3 = new ProduitFactory3();

        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("utilisation de la premiere fabrique ");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("utilisation de la seconde fabrique ");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("utilisation de la troisieme fabrique ");
        produitA = produitFactory3.getProduitA();
        produitB = produitFactory3.getProduitB();
        produitA.methodeA();
        produitB.methodeB();


    }
}