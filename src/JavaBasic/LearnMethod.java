package JavaBasic;

public class LearnMethod {
    //method with parameter
    static int myAddition(int a, int b){
        //int a= 500;
        //int b= 600;


        return a+b;
    }
    static int myAdd2(){
        int c=600;
        int d=600;

        return c+d;
    }
    static int myAdd3(){
        int e=700;
        int f=700;
        return e+f;

    }
    static int myNum(int number1, int number2){
        System.out.println(number1);
        System.out.println(number2);


        return number1 + number2;
    }
    static String myStr(String g){
        return g;

    }
    //nested method //method number one
    public static int myMulti(){
        int a=5;
        int b=10;
        return a*b;
    }//method number two
    public static int myMulti2(){

       return 5+myMulti();

    }//method number three
    public static int myMulti3(){
        return 100+myMulti2();
    }//nesting method inside method
    public static int myMulti4(){
        return 1000+myMulti3();
    }

    /**
     * it helps coder to understand what method does.
     * it provides documentation that is easily viewable when hover
     * @param a provide any integer value
     * @param b
     * @return
     */

    static int docStrExample(int a, int b){
        return a+b;

    }


    public static void main(String[] args) {
        System.out.println(myMulti4());
        docStrExample(500,600);
    }

    }



