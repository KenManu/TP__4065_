package Structuration.Adapter.adapterExemple2_01;

public class DListImpStack extends  DList implements IStack {
    @Override
    public void push(Object o) {
        System.out.print(" ajout pust ");
        insertTail(o);
    }

    @Override
    public void pop() {
        System.out.print("suppression ");
        removeTail();
    }

    @Override
    public void top(){
        System.out.print("retourne top ");
        getTail();
    }

}
