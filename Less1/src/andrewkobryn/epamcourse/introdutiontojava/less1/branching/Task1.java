package andrewkobryn.epamcourse.introdutiontojava.less1.branching;

public class Task1 {
    public static void main(String[] args) {
        function(30, 60);
    }

    public static void function(double a, double b) {
        double c = 180 - (a + b);

        if ((a > 0 && b > 0 && c > 0) && (a + b + c == 180)) {
            System.out.println("Существует");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Прямоугольный");
            } else {
                System.out.println("Не прямоугольный");
            }
        } else {
            System.out.println("Не существует");
        }
    }
}
