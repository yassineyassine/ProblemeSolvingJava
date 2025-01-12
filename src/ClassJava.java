// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A{

public  void getInfo(){
    System.out.println("Hello");
}


}

class B extends A{

    public  void getInfo(){
        System.out.println("Hello A");
    }

}

class HelloWorld {
    public static void main(String[] args) {

        A a =new A();
        A b =new B();

        b.getInfo();



    }
}
