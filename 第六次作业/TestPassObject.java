package 第六次作业;

public class TestPassObject {
    public static void main(String[] args) {
        Circle1 myCircle = new Circle1(1);
        int n = 5;
        printAreas(myCircle, n);
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(Circle1 c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
