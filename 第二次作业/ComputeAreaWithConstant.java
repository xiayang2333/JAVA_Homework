package 第二次作业;

import java.util.*;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for thr circle of radius " + radius + " is " + area);
    }
}
