package day5;

public class Interface {
    public static void main(String[] args){
        lightbulb l1 = new lightbulb();
        fan f1 = new fan();
        speaker s1 = new speaker();

        l1.turnon();
        l1.turnoff();

        f1.turnon();
        f1.turnoff();
        f1.increase();
        f1.decrease();

        s1.turnon();
        s1.turnoff();
        s1.increase();
        s1.decrease();

    }
}



 interface switchable{
    void turnon();
    void turnoff();
 }

 interface adjustable{
    void increase();
    void decrease();
 }

class lightbulb implements switchable{
    @Override
    public void turnon(){
        System.out.println("light bulb glows bright!");
    }
    @Override
    public void turnoff(){
        System.out.println("light bublb is dark");
    }
}

class fan implements switchable, adjustable{
     @Override
    public void turnon(){
        System.out.println("light bulb glows bright!");
    }
    @Override
    public void turnoff(){
        System.out.println("light bublb is dark");
    }
    @Override
    public void increase(){
        System.out.println("fan starts spinning");
    }
    @Override
    public void decrease(){
        System.out.println("fan stops");
    }
}

class speaker implements switchable, adjustable{
     @Override
    public void turnon(){
        System.out.println("speaker is now ON");
    }
    @Override
    public void turnoff(){
        System.out.println("speaker is now OFF");
    }
    @Override
    public void increase(){
        System.out.println("volume : LOUDER");
    }
    @Override
    public void decrease(){
        System.out.println("VOLUME : QUITER");
    }
}

