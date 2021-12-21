package extract_move_method;

import another_extract_move.Z;

public class X {
    Y y = new Y();
    Z z = new Z();

    public void foo() {
        int value = 0;
        if (z.isEqualZero(value)) {
            System.out.print("value is 0");
        } else {
            System.out.print("value is not 0");
        }
    }

    public void doStep1() {
        System.out.print("Do step 1.1");
        System.out.print("Do step 1.2");
        System.out.print("Do step 1.3");
    }

    public void doSomething() {
        doStep1();

        System.out.print("Do step 2");
    }
}
