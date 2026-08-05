package day6;
import java.util.*;
public class countdown {
   public static void main(String[] args) {
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        int count = 5;
        @Override
        public void run(){
            System.out.println(count);
            count--;
            if(count<=0){
                System.out.println("HAPPY BIRTHDAY");
                timer.cancel();
            }
        }
    };
    timer.schedule(task,0,1000);
   } 
}
