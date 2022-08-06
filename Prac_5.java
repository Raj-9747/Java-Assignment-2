/*    ID   : 21CE027
      Name : Fachara Raj
      Aim  : Develop a Program that illustrate method overloading concept.
 */

public class Prac_5 {
    // Here we have two functions.
    // One is taking two args and another is taking only one args.
    // Methods like these having same name and different args is knows as method overloading.
    public void printArea(float radius) 
    {
        System.out.println("Area of this circle : " + 3.14 * radius * radius);
    }

    public void printArea(float length, float width) 
    {
        System.out.println("Area of this rectangle : " + length * width);
    }
}
