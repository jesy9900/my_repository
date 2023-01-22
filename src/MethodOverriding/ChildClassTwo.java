package MethodOverriding;

public class ChildClassTwo extends ChildClassOne {
    void method() {
        super.method();

        System.out.println("this is child class two");
    }
}
