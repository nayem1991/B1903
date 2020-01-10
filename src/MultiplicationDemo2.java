import java.util.Scanner;

public class MultiplicationDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int m = 5,n=10;
        System.out.println ("Enter Intital Number  : ");
        n = input.nextInt ();

        System.out.print ("Enter Final number : ");
        n = input.nextInt ();

        for (int i = m; i <=n; i++) {
            for (int j = 1; j <=10; j++){
                System.out.println (i+" X "+j + " = "+i*j);

            }
            System.out.println ("\n\n");
        }
    }
}
