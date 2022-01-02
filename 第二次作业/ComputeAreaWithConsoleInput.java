package 第二次作业;

import java.util.*;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.1415;
        System.out.println("The area for circle of radius " + radius + " is " + area);
    }
}
