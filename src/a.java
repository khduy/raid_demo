package p9;

class A implements IA {
    public void m6() {
        System.out.println("Method m6");
    }

    public void m7() {
        System.out.println("Method m7");
    }

    public void m9() {
        System.out.println("Method 9");
    }

    public void m10() {
        System.out.println("Method 10");
    }
}

interface IA extends IA2 {
    void m6();

    void m7();
}

interface IA2 extends IA3 {
    void m9();
}

interface IA3 {
    void m10();
}

class B extends C {

}

class C {
    public void m6() {
        int value = 5;
        System.out.println("m" + value);
    }
}

class D {
    public void test() {
        System.out.println("Test method");
    }

    public void m8() {
        System.out.println("Do something");
    }
}