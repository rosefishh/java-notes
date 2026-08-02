package day5;

public class abstraction {
    public static void main(String[] args) {
        pizza p1 = new pizza();
        pasta p2 = new pasta();

        System.out.println("PIZZA:");
        System.out.println();
        p1.prepare();
        p1.deliver();

        System.out.println();
        
        System.out.println("PASTA:");
        System.out.println();
        p2.prepare();
        p2.deliver();
    }
}

abstract class fooditem{
    abstract void prepare();
    void deliver(){
        System.out.println("your food is on the way!");
    }
}

class pizza extends fooditem{
    @Override
    void prepare(){
        System.out.println("kneed dough, add sauce, bake at 200C");
    }
}

class pasta extends fooditem{
    @Override
    void prepare(){
        System.out.println("boil water, cook pasta, add sauce");
    }
}