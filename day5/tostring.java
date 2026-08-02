package day5;

public class tostring {
    public static void main(String[] args){
        car2 c1 = new car2("mustang",7);
        System.out.println(c1);
    }
}

class car2{
    String name;
    int number;

    car2(String name,int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return "car2{name='"+this.name+ "' , number ="+this.number+ "}";
    }
}