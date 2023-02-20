//5. Write a Java Program to find area and perimeter of a Circle?

import java.util.Scanner;

public class j_p_ass5 {

    public static void main(String[] args) {

        try (Scanner io = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle : ");
            double r=io.nextDouble();
            System.out.println("Area of the circle is : "+(Math.PI*r*r));
            System.out.println("Perimeter of the circle is : "+(2*Math.PI*r));
        }


    }
}
/*
 * Enter the radius of the circle : 5
   Area of the circle is : 78.53981633974483
   Perimeter of the circle is : 31.41592653589793
 */