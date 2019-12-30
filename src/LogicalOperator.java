import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        char ch;
        System.out.print ("Enter any letter : ");
        ch = input.next ().charAt ( 0 ); //a

        if(ch=='a' || ch=='i' || ch=='u' || ch=='A') {
            System.out.println ( "Vowel" );
        }else{
            System.out.println ("Consonant");
        }
    }
}
