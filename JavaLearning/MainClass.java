package JavaLearning;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)
    {
        float pi = (float) 3.142, res;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first input value");
        int val1 = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the second input value");
        int val2 = scanner2.nextInt();

        res = (val1 * val2)/pi;

        System.out.println("---- ---- ---- ----");
        System.out.println("The result of the calculation is " + res);
        System.out.println("---- ---- ---- ----");
    }
}