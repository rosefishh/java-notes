package day5;

public class inheritance2 {
    public 
    
}


class person{
    String name;
    int age;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class stud extends person{
    int roll;

    stud(int roll){
        this.roll = roll;
    }
}