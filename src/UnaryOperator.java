public class UnaryOperator {
    public static void main(String[] args) {

        int x = 25;
        int y;

        y = --x; //x=24
        System.out.println ("y = "+y);

        y = x--; // x = 24
        System.out.println ("y = "+y);

        y = ++x; // per incriment x=24
        System.out.println ("y = "+y);
        y = x++ ;
        System.out.println ("y = "+y);

    }
}
