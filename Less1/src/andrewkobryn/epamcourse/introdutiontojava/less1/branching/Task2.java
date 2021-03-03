package andrewkobryn.epamcourse.introdutiontojava.less1.branching;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findMax(findMin(2.5, -4), findMin(4, 6)));
    }

    public static double findMin(double x, double y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static double findMax(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
