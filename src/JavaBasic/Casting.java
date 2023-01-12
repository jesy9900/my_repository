package JavaBasic;

public class Casting {

    public static void main(String[] args) {

        int i = 50;
        short s = 5;
        long l = 10l;
        float f = 5.5f;
        double d = 7.774d;

        int convToInt =(int) (d);//int type we want it to convert to double
        double convToDouble =(double) (i);
        float conToFloat = (long) (f);



        System.out.println(convToInt);//narrowing

        System.out.println(convToDouble); //widening
        System.out.println(conToFloat); // narrowing
        int a= 10;
        long b= 654566789;
        int c =(int) (b);
        System.out.println(c);
        float j = 4.5f;
        double k = 5.2145667;
        System.out.println((float) (k));

        //Primitive to non-primitive, concat=Adding 2 string
        String str = "hello";
        String str2 = " this is java";
        System.out.println(str+str2);

        String str3 = "5+5";
        System.out.println(str3);

        int int1=40;
        String convertToNum=String.valueOf(int1);
        System.out.println("5"+convertToNum);
        int additionInt=100+100;
        System.out.println(additionInt);

        //lets convert it into string
        String conToStr2 = String.valueOf(additionInt);

        System.out.println(5+conToStr2);
        String abc="5";
        System.out.println(5+5);
        boolean b1= false;
        System.out.println(b1+" yes");
        char ch='H';
        System.out.println(ch);
        //non primitive to primitive
        int io=6;
        Integer myInt=5;//if we want to access the method we need to write the whole thing(int to integer)
        String myStr ="5";












        }



    }

