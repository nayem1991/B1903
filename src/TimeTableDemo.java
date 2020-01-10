import java.util.Scanner;

public class TimeTableDemo {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter any number : ");
        Scanner input = new Scanner ( System.in );
        num = input.nextInt();

        for (int i =1; i<= 10; i++){
            System.out.println (num+" X "+i + " = "+num*i);
        }

    }
}
