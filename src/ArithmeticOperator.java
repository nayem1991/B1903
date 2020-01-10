import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, num1, result;

        System.out.println ("Enter First number :");
        num = input.nextInt ();

        System.out.println ("Enter Second number :");
        num1 = input.nextInt ();

        result = num * num1;
        System.out.println ("multi = "+result);
        double result2 = (double)num / num1;// call type casting.

        System.out.println ("Div = "+result);
        result = num % num1;
        System.out.println ("Reminder = "+result);
    }

}
