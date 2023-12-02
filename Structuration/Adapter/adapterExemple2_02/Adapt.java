package Structuration.Adapter.adapterExemple2_02;

public class Adapt extends Dlist implements IFile  {

    public void push(Object o){
        System.out.print("ajout push ");
        insertTail(o);
    }
    public void pop (){
        System.out.print("delete pop ");
        removeHead();
    }

    public void top(){
        System.out.print("return top ");
        removeHead();
    }
}
