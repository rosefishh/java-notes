package day3;

public class strings {
    public static void main(String[] args){
        String name = "i love rose";
        
        //length of a string

        System.err.println("Length: "+ name.length());

        //character at index
        System.out.println("Character t index 1: " + name.charAt(1));

        //check if it contains
        System.out.println("does the string contain love? : " + name.contains("love"));

        //convert to uppercase and lowercase
        System.out.println("Uppercase: "+ name.toUpperCase());
        System.out.println("lowercase: "+ name.toLowerCase());

        //split string
        String[] parts = name.split(" ");
        System.out.println("First part: "+ parts[0]);
        System.out.println("second part: "+ parts[1]);
        System.out.println("third part: "+ parts[2]);
    }
    
}
