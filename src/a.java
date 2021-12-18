package p9;

class A implements IA {
    public void m6() {
        int value = 5;
        System.out.println("m" + value);
    }

    public void m7() {
        System.out.println("Do something");
    }

    public void m9() {
        System.out.println("Hello");
    }

    public void m10() {
        System.out.println("M 10 function");
    }
}

interface IA extends IA1 {
    void m6();
    void m7();
}

interface IA1 {
    void m9();
    void m10();
}
