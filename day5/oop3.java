package day5;
class student4{
    String name;
    int roll;
    static String college = "SIT";

    student4(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    void display(){
        System.out.println("student: " + name + "roll no. : " + roll + "college: " + college);
    }

}

class objectcounter{
    static int count = 0;

    objectcounter(){
        count++ ;
    }

    static void count(){
        System.out.println("total: " + count);
    }
}


class varcheck{
    String name;
    static String college = "SIT";

    varcheck(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("college: " + college);
    }

    public static void main(String[] args){
        varcheck v1 = new varcheck("Aman");
        varcheck v2 = new varcheck("Chintu");

        v1.display();
        v2.display();

    }
}


class student5{
    String name;
    static String college = "SIT";

    student5(String name){
        this.name=name;
    }

    void display(){
        System.out.println("name: " + name + "\ncollege: " + college);
    }

    public static void main(String[] args){
        student5 s1 = new student5("sam");
        student5 s2 = new student5("rose");

        s1.display();
        s2.display();

        s1.college = "salesian";

        System.out.println("After changing static variable: ");

        s1.display();
        s2.display();
    }
}


class method{
    static void greet(){
        System.out.println("Hello! welcome to Java");
    }
}

public class oop3{
    public static void main(String[] args){
        method.greet();
    }
}


