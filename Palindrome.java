package mod1;
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            while(true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            int reverse = 0;
            int orgin = num;

                while (num != 0) {
                    reverse = reverse * 10 + num % 10;
                    num /= 10;

                }
                if (reverse == orgin) {
                    System.out.println("Palindrome");

                } else {
                    System.out.println("Not Palindrome");
                }
            }
        }

        catch(Exception e){
            System.out.println("Enter only number ");
        }
    }

}
