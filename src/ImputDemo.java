import java.util.Scanner;

public class ImputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );

        int num ;
        String name;
        System.out.print ("Enter you name : ");
        name = input.nextLine ();
        System.out.print ("Welcome : "+name);
        System.out.println ("Enter any number");
        num = input.nextInt ();
        System.out.println ("num = "+num);
    }
}
