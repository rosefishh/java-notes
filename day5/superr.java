package day5;

class animal{
    String name;
    int age;

    public animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public void makesounf(){
        System.out.println("some generic sound");
    }
}

public class superr{
    public static void main(Stirng[] args){
        animal a1 = new animal("t-rex",169);
        a1.makesound;
    }
}
