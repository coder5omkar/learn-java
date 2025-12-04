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
/*            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }*/
            //2. String buffer class method
/*            StringBuffer sb = new StringBuffer(String.valueOf(num));
            StringBuffer rv= sb.reverse();
            int reve = Integer.parseInt(String.valueOf(rv));*/

            //3. String Builder
            StringBuilder sb = new StringBuilder();
            sb.append(num);
            sb = sb.reverse();

            System.out.println("Reverse number is :" + sb);
        }catch (InputMismatchException e){
            System.out.println(e.getStackTrace());
        }
    }
}
