package day6;

public class threading{
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
    }
}

class thread1 extends Thread {
    public void run(){
        for(int i =0; i<=5; i++){
            System.out.println(i);

            try{
                thread1.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("THREADING INTERRUPTED!");
            }
        }
        System.out.println("TIME'S UP!");
    }
}

