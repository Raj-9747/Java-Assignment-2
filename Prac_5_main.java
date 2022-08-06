/*    ID   : 21CE027
      Name : Fachara Raj
      Aim  : Develop a Program that illustrate method overloading concept.
 */

import java.util.Scanner;

public class Prac_5_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prac_5 obj = new Prac_5();
        System.out.println("Enter radius :");
        float rad = sc.nextFloat();
        obj.printArea(rad);
        System.out.println("Enter length and width of the rectangle : ");
        float len = sc.nextFloat();
        float width = sc.nextFloat();
        obj.printArea(len,width);
    }
}
