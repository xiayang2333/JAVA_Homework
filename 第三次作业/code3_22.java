package 第三次作业;

import java.util.Scanner;

public class code3_22 {
    public static void main(String[] args) {
        double eps = 0.00000001;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double ans = Math.sqrt(x * x + y * y);
        if (ans - 10.0 < eps) {
            System.out.println("point (" + x + " " + y + ") is in the circle");
        } else {
            System.out.println("point (" + x + " " + y + ") is not in the circle");
        }
    }
}
