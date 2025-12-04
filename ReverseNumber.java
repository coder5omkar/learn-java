import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number :");
            int num = sc.nextInt();

            // 1. using algorithm
            int rev = 0;
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }

            System.out.println("Reverse number is :" + rev);
        }catch (InputMismatchException e){
            System.out.println(e.getStackTrace());
        }
    }
}
