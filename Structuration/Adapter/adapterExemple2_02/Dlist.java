package Structuration.Adapter.adapterExemple2_02;

public class Dlist {
    public void insert (Object o){
        System.out.println("Dlist.insert");
    }
    public void remove (){
        System.out.println("Dlist.remove");
    }
    public void insertHead (Object o){
        System.out.println("insertHead");
    }
    public void insertTail (Object o){
        System.out.println("insertTail");
    }
    public void removeHead (){
        System.out.println("removeHead");
    }
    public void removeTail (){
        System.out.println("removeTail");
    }
    public void getHead (Object o){
        System.out.println("getHead");
    }
    public void getTail (){
        System.out.println("getTail");
    }
}
