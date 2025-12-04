import java.text.MessageFormat;

public class Swap2Numbers {
    // ## swapping two numbers
    public static void main(String args[]) {

        int a = 10;
        int b = 20;


        System.out.println(MessageFormat.format("before swap value of a: {0}, b:{1}", a, b));
 /*         logic 1
        int t = a;
        a = b;
        b = t;

        System.out.println(MessageFormat.format("after swap value of a: {0}, b:{1}", a, b));*/

        // logic 2 use of + -
/*      a = a+b;
        b = a-b;
        a = a-b;*/

        // logic 3 use of * / only if a and b values should not be 0
/*        a = a*b;
        b = a/b;
        a = a/b;*/

        // logic 4 bitwise X-or operator
/*        a=a^b;
        b=a^b;
        a=a^b;*/

        // logic 5 Single statement

        b = a+b-(a=b);


        System.out.println(MessageFormat.format("after swap value of a: {0}, b:{1}", a, b));


    }

}