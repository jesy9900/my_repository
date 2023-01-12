package JavaBasic;

import java.util.concurrent.Callable;

public class ConstructorAndInst {
    //THE CONSTRUCTOR IS THE DOOR FOR CLASS, WHEN WE MAKE AN OBJ, WE MUST HAVE CONSANDINS
    //CONSTRUCTOR NAME MUST BE AS CLASS NAME
    ConstructorAndInst(){
        //WE CAN NOT USE OBJ WITHOUT CONSANDINS, CONSANDINS COME WITH CLASS AUTOMATICALLY
    }
    String str;
    int i;

    public static void main(String[] args) {
        ConstructorAndInst obj= new ConstructorAndInst();
        //PREFEREd way obj=is referrence
        obj.str = "hello";
        obj.i = 10;
        //another way

        new ConstructorAndInst().str= "hello";
        new ConstructorAndInst().i= 10;

            }
        }


