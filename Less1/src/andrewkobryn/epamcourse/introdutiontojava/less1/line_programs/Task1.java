package andrewkobryn.epamcourse.introdutiontojava.less1.line_programs;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(function(7.4, 1.2, 5.6));
    }

    public static double function(double numberA, double numberB, double numberC) {
        return ((numberA - 3) * numberB / 2) + numberC;
    }
}
