package p9;

class ABC {
    public void m6() {
        int value = 5;
        System.out.println("m" + value);
    }

    public void m7() {
        System.out.println("Do something");
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