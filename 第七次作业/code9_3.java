package 第七次作业;

//import java.util.Date;
public class code9_3 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        long time = 10000;
        for (int i = 1; i <= 8; i++) {
            date.setTime(time);
            System.out.println(date.toString());
            time *= 10;
        }
    }
}
