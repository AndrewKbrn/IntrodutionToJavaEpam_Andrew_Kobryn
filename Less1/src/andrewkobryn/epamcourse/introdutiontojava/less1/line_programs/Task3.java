package andrewkobryn.epamcourse.introdutiontojava.less1.line_programs;

public class Task3 {
    public static void main(String[] args) {
        function(45, 30);
    }

    public static void function(double x, double y) {
        double angleX = Math.toRadians(x);
        double angleY = Math.toRadians(y);
        double divided = Math.sin(angleX) + Math.cos(angleY);
        double divider = Math.cos(angleX) - Math.sin(angleY);
        if (divider != 0) {
            System.out.println((divided / divider) * Math.tan(angleX * angleY));
        } else {
            System.out.println("division by 0");
        }

    }
}
