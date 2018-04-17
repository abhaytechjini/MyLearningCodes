package JavaLearning;

import java.util.Scanner;

public class NewClass extends BaseClass {
    public void area() {
        float area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first diagonal of the rhombus");
        float diagonal = scanner.nextFloat();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the second diagonal of the rhombus");
        float diagonal1 = scanner1.nextFloat();

        area = (float) ((0.5) * (diagonal) * (diagonal1));
        System.out.println("The area of the rhombus is as follows" + area);
    }
}