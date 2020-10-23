package exercise2;

public class PiApproximation {
  public static void main(String[] args) {
        double a = (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/11 - 1.0/13 + 1.0/17 - 1.0/19 + 1.0/23) ;
        double b = (4.0*a) ;

        System.out.print("Pi: " + b);
       
    }

}