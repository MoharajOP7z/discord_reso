
//6. Write a Java Program to find area and perimeter of a Rectangle?

import java.util.Scanner;

public class j_p_ass6 {

    public static void main(String[] args) {
        
        Scanner io=new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        double length=io.nextDouble();
        System.out.print("Enter width of rectangle:");
        double width=io.nextDouble();
        System.out.println("area and perimeter of a Rectangle : "+(length*width)+" & "+(2*(length+width)));
    }
    
}
/* 
 * Enter length of rectangle:4
   Enter width of rectangle:5
   area and perimeter of a Rectangle : 20.0 & 18.0
 */