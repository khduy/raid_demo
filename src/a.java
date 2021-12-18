package p9;

class ABC implements IA2 {
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