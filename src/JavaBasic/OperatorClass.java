package JavaBasic;

public class OperatorClass {

    public static void main(String[] args) {

        //+ or addition

        System.out.println(4+5);

        //- or subtraction

        System.out.println(7-6);

        //multiplication or *

        System.out.println(8*9);

        //division or/

        System.out.println(5/4);

        //modulus operator or % (it print the reminder)

        System.out.println(100%21);

        //assignment operator

        // = operators (reassign value, so it will print the last one)

        int x=10;

        x=20;

        x=30;

        x=40;

        System.out.println(x);

        //incremental +=

        int y = 5;

        y += 4;

        System.out.println(y);

        int z = 10;

        System.out.println(z++);

        System.out.println(z);

        //decrement -=

        int n = 10; // once we initilize a variable we don't have to declare it again

        n-=6;

        System.out.println(n);

        //multipication *=

        n *=5;

        System.out.println(n);

        //division

        n /=4;

        System.out.println(n);

        //modulus %= (will give reminder)

        n %=2;

        System.out.println(n);

        //comparison operator

        // "==" equal sign

        int c = 100;

        int d = 200;

        System.out.println(c==d);

        //not equal !=

        System.out.println(c!=d);

        //greater than exclusive (>) { exclisive mean = exclude 100, till 98}

        int e = 6;

        int f= 6;

        System.out.println(e>f);

        //greater than or equal to >= (inclusive) that means include 100

        System.out.println(e>=f);

        //logical operator && and (ampersand) {if one of them false it will print false}

        int g=100;

        System.out.println(40>50 && 100>200);

        int i=10;

        int j=20;

        if (i<5 && j>15) {

            System.out.println("hey this is java");

        }else {

            System.out.println("you are wrong");

            //or ||

            int currentyear = 2022;

            int nextyear = 2023;

            if (currentyear>nextyear || currentyear<nextyear);

            System.out.println("you guys are awsome");

            // ! = not

            boolean r= 5>10;

            System.out.println(r);



        }









    }
}
