
//8. Write a Java Program to display a number is Posetive or Negative?

import java.util.Scanner;

public class j_p_ass8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println(n + " is Positive");
            }
        else if(n<0)
        {
            System.out.println(n + " is Negative");
        }
    
    }
}
/*
 * Enter a number : 8
   8 is Positive
 */