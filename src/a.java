package p9;

class ABC {
    public void m6() {
        int value = 5;
        System.out.println("m" + value);
    }

    public void m7() {
        System.out.println("Do something");
    }

    public void m9() {
        System.out.println("Method 9");
    }

    public void m10() {
        System.out.println("Method 10");
    }
}

interface IA /*extends IA2*/ {
    void m6();

    void m7();
}

interface IA3 {
    void m10();
}