package JavaBasic;

public class LearningString {

    public static void main(String[] args) {
        //length
        String s= "hello  ";
        System.out.println(s.length());

        //concat is add or joining
        System.out.println(s+ " MY name is jesy");//concat

        String s2= " whats UP";
        System.out.println(s.concat(s2));

        //trim remove white spaces
        System.out.println(s2.trim());

        //toLowercase
        System.out.println(s.toLowerCase());

        //TOUPPERCASE
        System.out.println(s2.toUpperCase());

        //substring (index count from 0)

        System.out.println(s.substring(2));
        System.out.println(s.substring(6));

        //equals
        String s3= "name";
        String s4= "Name";
        System.out.println(s3=(s4));

    }

}
