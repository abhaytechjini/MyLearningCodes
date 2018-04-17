package JavaLearning;

import java.util.Scanner;

public class BaseClass {

    public void simpleInterest() {
        double simpleInterest;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the time of investment");
        int time = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the rate of interest");
        float interest = scanner2.nextFloat();

        simpleInterest = (principal * time * interest) / 100;
        System.out.println("The simple interest is as follows" + simpleInterest);
    }
}
