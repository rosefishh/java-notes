package day5;

public class inheritance1{
public static void main(String[] args){
        car c1 = new car("ford");
        c1.start();
        System.out.println(c1.name);
    }
}

class vehicle{
    void start(){
        System.out.println("The engine has started");
    }
}

class car extends vehicle{
    String name;

    car(String name){
        this.name = name;
    }
}









