package extract_move_method;

public class X {
   Y y = new Y();

    public void foo() {
        int value = 0;
        if (y.isEqualZero(value)) {
            System.out.print("value is 0");
        } else {
            System.out.print("value is not 0");
        }
    }
}
