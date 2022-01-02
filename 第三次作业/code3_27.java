package 第三次作业;

import java.util.Scanner;

public class code3_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double maxy = -x / 2.0 + 100.0;
        if (x > 0 && x < 200 && y > 0 && y < maxy) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
