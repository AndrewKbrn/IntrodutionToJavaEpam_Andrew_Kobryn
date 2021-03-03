package andrewkobryn.epamcourse.introdutiontojava.less1.line_programs;

public class Task5 {
    public static void main(String[] args) {
        int number = 3599;
        parseNumberToTime(number);
    }
    public static void parseNumberToTime(int number){
        int hours = number / (60 * 60);
        int min = number / 60 % 60;
        int sec = number % 60;

        System.out.println(hours + "ч " + min + "мин " + sec + "сек");
    }
}
