package app;

import java.util.Scanner;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Converter App.");
        System.out.println("Version 1.0.");
        System.out.print("Please enter kilos: ");
        double kgs = scanner.nextDouble();

        System.out.print("Please enter pounds: ");
        double pnds = scanner.nextDouble();

        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);

        System.out.println("Result is " + kgs + " kgs equals " + pounds + " pounds");
        System.out.println("Result is " + pnds + " pnds equals " + kilos + " kgs");
    }

    private static double convKgsToPounds(double kgs){
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pnds){
        return pnds / CONV_K;
    }
}
