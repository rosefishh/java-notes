package day5;
import java.util.*;
class student{
    String name;
    int roll;
    double marks;


    public student(String name, int roll, double marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    public void display(){
        System.out.println("Name: "+ name + "Roll no.: "+ roll + "Marks: "+ marks );
    }
}

public class oop2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        student[] s = new student[5];

        System.out.println("ENTER THE DETAILS OF TH STUDENT:\n");
        for(int i=0; i<s.length; i++){
            System.out.println("Student"+ (i+1) + ":" );
            System.out.println("ENTER NAME: ");
            String name = sc.nextLine();

            System.out.println("ENTER ROLL NO.: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("ENTER MARKS: ");
            double marks = sc.nextDouble();
            sc.nextLine();
            
            s[i] = new student(name,roll,marks);

        }

        System.out.println("---ALL STUDENTS RECORD---");
        for(student ss : s){
            ss.display();
        }
        sc.close();


        double highest = s[0].marks;
        String topper = s[0].name;
        for(int i=0; i<s.length; i++){
            if (s[i].marks>highest){
                highest = s[i].marks;
                topper = s[i].name;
            }
        }
        System.out.println("The highest marks is " + highest + "scored by "+ topper);

        sc.close();
    }
}