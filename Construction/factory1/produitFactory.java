package Construction.factory1;

public class produitFactory {

    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;


    public produitA getProduitA(int typeProduit){
        produitA produitA = null;


        switch (typeProduit){
            case TYPE_PRODUITA1:
                produitA = new produitA1();
                break;
            case TYPE_PRODUITA2:
                produitA = new produitA2();
                break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");

        }

        return produitA;
    }
}
