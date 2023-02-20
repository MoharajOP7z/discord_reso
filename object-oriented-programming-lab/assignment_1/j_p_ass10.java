//10. Write a Java Program to swap two number?

import java.util.Scanner;

public class j_p_ass10 {

    public static void main(String[] args) {
        
       int x, y, t;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       /*swapping */  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );
    }
    
}

/*
Enter the value of X and Y
6
8
before swapping numbers: 6  8
After swapping: 8   6    
*/