import java.util.Scanner;

public class CircleDemo {

        public static void main(String[] args) {
            Scanner input = new Scanner ( System.in );
            double redius, area;
            System.out.print ( "Enter redius : " );
            redius = input.nextDouble ();

            area = 3.1416 * redius * redius;
            System.out.println ( "Area of circle : " + area );
        }
    }
