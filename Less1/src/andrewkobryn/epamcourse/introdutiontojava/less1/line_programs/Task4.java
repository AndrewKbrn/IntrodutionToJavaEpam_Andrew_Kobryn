package andrewkobryn.epamcourse.introdutiontojava.less1.line_programs;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(function(333.242));
    }

    public static double function(double number) {
        double number1 = (number * 1000) % 1000;
        double temp = (int) number;
        double number2 = temp / 1000;
        return number1 + number2;
    }
}
