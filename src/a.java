package p9;

class A1 extends C implements IA2 {

    public void m8() {
        System.out.println("Do something");
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

interface IA2 extends IA3test {
    void m9();
}

interface IA3test {
    void m10();
}

