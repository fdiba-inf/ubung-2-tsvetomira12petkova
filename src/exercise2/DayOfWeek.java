package exercise2;

import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Wochentag:");
    int Tag = input.nextInt();

  if (Tag==1){
    System.out.println ("Day of week: Monday");
  }
  else if (Tag==2){
    System.out.println("Day of week: Tuesday");
  }
  else if (Tag==3){
    System.out.println("Day of week: Wednesday");
  }
  else if (Tag==4){
    System.out.println("Day of week: Thursday");
  }
  else if (Tag==5){
    System.out.println("Day of week: Friday");
  }
  else if (Tag==6){
    System.out.println("Day of week: Saturday");
  }
  else if (Tag==7){
    System.out.println("Day of week: Sunday");
  }
  else {
    System.out.println("Invalid day");
  }


}
}