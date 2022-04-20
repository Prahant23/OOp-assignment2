import java.util.Scanner;

public class Maxmimum {
    public static void main(String[] args) {
        //. Write a JAVA program to find maximum between two numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter second number");
        int num2 = scanner.nextInt();
        if (num1>num2){
            System.out.println("num1 is greater");

        } else{
            System.out.println("num2 is greater");
        }


    }


}
