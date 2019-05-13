package Test;

public class Test {
    static public void main(String[] str){
        A A1 = new A();
        A B1 = new B();
        A.a = 1;
        System.out.println(A.a);
        System.out.println(B.a);

    }
}

class A{
    static public int a = 0;
}

class B extends A{
}