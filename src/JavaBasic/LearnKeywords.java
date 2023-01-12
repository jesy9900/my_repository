package JavaBasic;

public class LearnKeywords {
    //public everyone can see it use it
    int myNumber=5;
    public static void myMethod() {

        System.out.println("hi");
        System.out.println("my name is forida");
        System.out.println("this is my java");
    }

    //protected can be use within the class and package that was created

    protected static void myProtected() {

        System.out.println("this is the example of myProtected method");

    }
    //private can be use only within the class it was created for
    private static void myPrivate(){
        System.out.println("this is private method example");
    }
    //default (builtin), don't need any access modifier
    //IT IS SAME AS PROTECTED ACCESS MODIFIER, it can only access within same class and package
    static void myDefault(){
        System.out.println("this is my dafault method example");
    }
    //void doesnt retuen anything, u have to change it with return type: such as, int, boolean etc.
    public static int myVoidExample(){
        int x =7;
        int y =6;

        return x + y;
    }
    public static boolean mMethod2(){
        int x = 20;
        int y = 30;
        return x>y;
    }

    public static void main(String[] args) {
        myMethod();
        myProtected();
        myProtected();
        myDefault();

    }

}

