package JavaBasic;

public class ThirdClass {
    public static int x =890;//global variable

    public void one(){
        System.out.println(x);
        int y=50;//local variable;

    }
    public void two(){
        System.out.println(x);
        int z=60;//local variable

    }

    public static void main(String[] args) {
        ThirdClass obj= new ThirdClass();
        obj.one();
        obj.two();

    }
}


