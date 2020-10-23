package exercise2;
import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers for a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        

        if (a!=0){
           double D = b * b - 4 * a * c;
          if (D>0 ){
            double squareRoot = Math.sqrt(D);
            double x1 = (- b + squareRoot) / (a * 2);
            double x2 = (- b - squareRoot) / (a * 2);
            
            System.out.println("x1 "+x1);
            System.out.println("x2 "+x2);
            } else if (D==0){
              double x = (- b) / (a * 2);
              System.out.println("x1/2 "+x);
            } else {
              System.out.println("Imaginary values");
            }

        }
        else if (b!=0) {
          double x3 = - (c / b);
          System.out.println("x "+x3);

        }
        else if(c!=0){
          System.out.println("No values");

        }
        else {
          System.out.println("Many values");
        }



        }
        }
  
        
        