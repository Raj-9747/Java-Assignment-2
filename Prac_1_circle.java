/*   ID   : 21CE027
     Name : Fachara Raj
     Aim  : Design a class named Circle containing following attributes and behavior.
            • One double data field named radius. The default value is 1.
            • A no-argument constructor that creates a default circle.
            • A Single argument constructor that creates a Circle with the specified radius.
            • A method named getArea() that returns area of the Circle.
            • A method named getPerimeter() that returns perimeter of it. 
 */

public class Prac_1_circle
{
    public double radius;

    Prac_1_circle()
    {
        radius = 1;
    }

    Prac_1_circle(double r)
    {
        radius = r;
    }

    public double getArea()
    {
        double Area = 3.14*radius*radius;
        return Area;
       
    }

    public double getPerimeter()
    {
        double perimeter = 2*3.14*radius;
        return perimeter;
    }
}