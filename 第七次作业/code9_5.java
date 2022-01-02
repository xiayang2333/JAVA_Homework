package 第七次作业;

import java.util.GregorianCalendar;

public class code9_5 {
    public static void main(String[] args) {
        GregorianCalendar x = new GregorianCalendar();
        System.out.println(x.get(x.YEAR) + " " + x.get(x.MONTH) + " " + x.get(x.DAY_OF_MONTH));
        x.setTimeInMillis(1234567898765L);
        System.out.println(x.get(x.YEAR) + " " + x.get(x.MONTH) + " " + x.get(x.DAY_OF_MONTH));
    }
}
