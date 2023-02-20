//7. Write a Java Program to display a number is odd or even?

import java.util.Scanner;

public class j_p_ass7 {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = reader.nextInt();

            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }
}
/*
 * Enter a number: 5
   5 is odd
 */