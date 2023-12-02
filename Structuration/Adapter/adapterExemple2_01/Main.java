package Structuration.Adapter.adapterExemple2_01;

public class Main {
        public static void main(String[] args) {
            Object o = null;
            IStack DlistA = new DListImpStack();
            DlistA.push(o);
            DlistA.pop();
            DlistA.top();
        }

}
