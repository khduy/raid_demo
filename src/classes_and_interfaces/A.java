package p9.classes_and_interfaces;

public class A implements IA1 {

    public void m8() {
        System.out.println("Method m7");
    }

    public void m9() {
        System.out.println("Method 9");
    }

    public void m11() {
        System.out.println("Method 10");
    }
}

interface IA1 {
    void m8();
}


//interface IA2 extends IA3 {
//    void m9();
//}
//
//interface IA3 {
//    void m10();
//}

//class C {
//    public void m6() {
//        int value = 5;
//        System.out.println("m" + value);
//    }
//}
//
//class D {
//    public void test() {
//        System.out.println("Test method");
//    }
//
//    public void m8() {
//        System.out.println("Do something");
//    }
//}