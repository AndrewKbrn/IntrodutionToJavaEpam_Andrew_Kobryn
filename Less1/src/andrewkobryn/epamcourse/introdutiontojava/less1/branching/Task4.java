package andrewkobryn.epamcourse.introdutiontojava.less1.branching;

public class Task4 {
    public static void main(String[] args) {
        double a = 5.5;
        double b = 4.5;
        willItPass(2,4,6.7,a,b);
    }

    public static void willItPass(double x, double y, double z, double a, double b) {
        double xyS = x * y;
        double yzS = y * z;
        double xzS = x * z;
        double holeS = a * b;

        int count = 0;

        if (xyS < holeS) {
            count++;
        }
        if (yzS < holeS) {
            count++;
        }
        if (xzS < holeS) {
            count++;
        }
        if (count == 3) {
            System.out.println("Пройдёт полностью");
        } else if (count == 2) {
            System.out.println("Пройдёт с двух сторон");
        } else if (count == 1) {
            System.out.println("Пройдёт с одной стороны");
        } else {
            System.out.println("Не пройдёт");
        }
    }
}
