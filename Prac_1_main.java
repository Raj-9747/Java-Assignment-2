/*   ID   : 21CE027
     Name : Fachara Raj
     Aim  : Design a class named Circle containing following attributes and behavior.
            • One double data field named radius. The default value is 1.
            • A no-argument constructor that creates a default circle.
            • A Single argument constructor that creates a Circle with the specified radius.
            • A method named getArea() that returns area of the Circle.
            • A method named getPerimeter() that returns perimeter of it. 
 */

import java.util.Scanner;

public class Prac_1_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double r = sc.nextDouble();
        Prac_1_circle obj = new Prac_1_circle(r);
        double a =  obj.getArea();
        System.out.print("Area of Circle is : "+a);
        double p = obj.getPerimeter();
        System.out.print("Perimeter of Circle is : "+p);
        sc.close();
    }
}
