package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
      System.out.println("r:");
        Scanner input = new Scanner(System.in);
        

        double Pi = 3.14;
        double r = input.nextDouble();
        double C = 2*Pi*r;
        double A = 2*Pi*r*r;

        System.out.println("Circumference " + C);
        System.out.println("Area " + A  );
    }

}