package day2;
import java.util.*;
public class switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day(1-3): ");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("funday!");
        }
    }
    
}
