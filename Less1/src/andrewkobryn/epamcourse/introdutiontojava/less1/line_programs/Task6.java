package andrewkobryn.epamcourse.introdutiontojava.less1.line_programs;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(function(1,-2));
    }
    //знаю что коментарии такие это зло, но решил рассказать как я делал
    //я разделил область на графике на 2, та где у больше и меньше
    //и обрабатывал их по отдельности
    public static boolean function(double x, double y){
        if(y >= 0){
            return ((1 >= x) && (x >= -1)) && ((2 >= y) && (y >= 0));
        }else if(y <= 0){
            return ((2 >= x) && (x >= -2)) && ((1.5 >= y) && (y >= -1.5));
        }else{
            return false;
        }
    }
}
