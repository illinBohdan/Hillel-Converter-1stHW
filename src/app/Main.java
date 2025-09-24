package app;

import java.util.Scanner;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Converter App.");
        System.out.println("Будь ласка введіть кількість кілограм");

        double kgs = scanner.nextDouble();
        double pounds = convKgsToPounds(kgs);
        System.out.println("Result is " + kgs + " kgs equals " + pounds + " pounds");
    }

    private static double convKgsToPounds(double kgs){
        return kgs * CONV_K;
    }
}
