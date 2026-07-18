package day3;

public class array {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5};
        System.out.println("First: "+ num[0]);
        System.out.println("Last: "+ num[num.length-1]);

        System.out.println("All Numbers: ");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]+ " ");
        }

        System.out.println();

        // enhanced for loop (for-each)
        System.out.println("All Number: ");
        for(int numbers : num){
            System.out.println(numbers + " ");
        }
        System.out.println();



        //2-D array

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i= 0; i<=2; i++){
            for(int j=0; j<=2;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
