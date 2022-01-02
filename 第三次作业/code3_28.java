package 第三次作业;

import java.util.Scanner;

public class code3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's cnter x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        System.out.print("Enter r2's cnter x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        if (x2 + w2 <= x1 + w1 && x2 - w2 >= x1 - w1 && y2 + h2 <= y1 + h1 && y2 - h2 >= y1 - h1) {
            System.out.println("r2 is inside r1");
        } else if (x2 + w2 <= x1 - w1 || x2 - w2 >= x1 + w1 || y2 + h2 <= y1 - h1 || y2 - h2 >= y1 + h1) {
            System.out.println("r2 does not overlap r1");
        } else {
            System.out.println("r2 overlaps r1");
        }
    }
}
