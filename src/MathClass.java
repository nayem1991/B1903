public class MathClass {
    public static void main(String[] args) {
        int x =20;
        int y = 30;

        int max = Math.max ( x,y );

        System.out.println ("Maximum = "+max);

        int min = Math.max ( x,y );
        System.out.println ("Minimum = "+min);

        int absolute = Math.abs ( y );
        System.out.println ("Absoulet of y = "+absolute);

        double power = Math.pow ( x,y );
        System.out.println ("x to the power y = "+power);

        int round =Math.round ( 7.7f );
        System.out.println ("round of 7.7 + "+round);
    }
}
