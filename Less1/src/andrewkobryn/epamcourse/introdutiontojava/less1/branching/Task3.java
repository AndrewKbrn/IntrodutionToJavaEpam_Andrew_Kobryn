package andrewkobryn.epamcourse.introdutiontojava.less1.branching;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(threeDotsOnOneLine(1, 8, -2, -7, -4, -17));
    }

    public static boolean threeDotsOnOneLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3);
    }
}
