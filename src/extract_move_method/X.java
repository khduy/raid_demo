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


    public void doSomething(){
        System.out.println("do A");
        System.out.println("do B");
        System.out.println("do C");

        System.out.println("do X");
        System.out.println("do Y");
        System.out.println("do Z");
    }
}
