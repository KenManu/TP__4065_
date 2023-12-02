package Structuration.Adapter.adapterExemple2_02;

public class Main {
    public static void main(String[] args) {
        Object o = null;
        IFile adapt = new Adapt();
        adapt.push(o);
        adapt.pop();
        adapt.top();
    }
}
