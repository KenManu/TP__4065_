package Construction.factoryMethod1;

public class produitFactory1 extends produitFactory {
    protected produitA createProduitA(){
        return new produitA1();
    }
}
