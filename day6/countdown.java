package day6;
import java.util.*;
public class countdown {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER NUMBER OF SECONDS TO START THE COUNTDOWN:");
    int num = sc.nextInt();
    System.out.println("YOUR COUNTDOWN STARTS NOW!");
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        int count = num;
        @Override
        public void run(){
            System.out.println(count);
            count--;
            if(count<=0){
                System.out.println("HAPPY       BIRTHDAY");
                timer.cancel();
            }
        }
    };
    timer.schedule(task,0,1000);
   } 
}
