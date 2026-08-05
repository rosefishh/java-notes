package day6;

import java.util.Scanner;

interface payment{
    void pay(double amount);
 }

public class anonyclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT:");
        double amount = sc.nextDouble();

        payment p = new payment(){
            @Override
            public void pay(double amount){
                System.out.println("Amount paid:"+ amount);

                if(amount>5000){
                    System.out.println("payment sucessful with cashback");
                }
                else{
                    System.out.println("payment sucessful");
                }
            }
        };
        p.pay(amount);
    }
}

