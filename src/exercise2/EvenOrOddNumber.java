package exercise2;

import java.util.Scanner;
  
    public class EvenOrOddNumber {

          public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");

        int Zahl = input.nextInt();
        if(Zahl%2==0){
          System.out.println("Number is even");
        }
        
        else if (Zahl%2==1){
          System.out.println("Number is odd");

        }
        
      }
        
      }
