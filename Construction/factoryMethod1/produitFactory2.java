package Construction.factoryMethod1;

public class produitFactory2 extends produitFactory {
    protected produitA createProduitA(){
        return new produitA2();
    }
}