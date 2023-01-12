package JavaBasic;

public class Phone {
    //THIS CLASS IS THE BLUEPRINT OF ALL CLASS THAT WILL EVER EXIST
    String color;
    String brand;
    int size;
    int weight;
    static String typeOfPhone = "smart phone";

    void turnOn(){
        System.out.println("turn on the phone");

    }
    void turnOf(){
        System.out.println("turn of the phone");

    }
    void phoneCall(){
        System.out.println("making phone call");

    }
    void sendText(){
        System.out.println("send text");


    }

    public static void main(String[] args) {

        Phone myPhone = new Phone();
        Phone myPhone2 = new Phone();

        //phone one
        myPhone.brand = "apple";
        myPhone.brand= "samsung";
        myPhone.brand = "apple";


        myPhone.color = "gray";
        myPhone.size = 7;
        myPhone.weight = 238;

        //another phone
        myPhone2.brand = "samsung";
        myPhone2.color = "silver";
        myPhone2.size = 8;
        myPhone2.weight = 300;

        typeOfPhone = "regular phone";
        System.out.println(typeOfPhone);
        

    }

}
