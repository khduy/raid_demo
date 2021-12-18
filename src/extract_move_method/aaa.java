public class Aaa {
    public boolean isEqualZero(int i) {
        return i == 0;
    }
        
    public void foo() {
        int i = 0;
        if (isEqualZero(i)) {
            System.out.println("i is 0");
        } else {
            System.out.println("i is not 0");
        }
    }
}