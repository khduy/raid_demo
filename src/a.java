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
}

interface IA {
    void m6();
    void m7();
    void m9();
}
