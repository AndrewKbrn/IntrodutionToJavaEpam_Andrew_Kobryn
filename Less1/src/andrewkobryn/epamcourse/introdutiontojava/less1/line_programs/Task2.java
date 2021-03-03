package andrewkobryn.epamcourse.introdutiontojava.less1.line_programs;

public class Task2 {
    public static void main(String[] args) {
        function(3, 2.5, 3.1);
    }

    public static void function(double numberA, double numberB, double numberC) {
        double divided = numberB + Math.sqrt(Math.pow(numberB, 2) + 4 * numberA * numberC);
        double divider = 2 * numberA;
        if (divider != 0) {
            System.out.println((divided / divider) + (Math.pow(numberA, 3) * numberC + Math.pow(numberB, -2)));
        } else {
            System.out.println("division by 0");
        }
    }
}
