package assigment_2;
//  Using instance variables:  
public class j_a1 {
    int num1;
    int num2;
    
    public int add() {
       return num1 + num2;
    }
    
    public static void main(String[] args) {
       j_a1 adder = new j_a1();
       adder.num1 = 5;
       adder.num2 = 10;
       int result = adder.add();
       System.out.println("Result is: " + result);
    }
 }

// Using static local variables:

public class j_a1 {
    public static int add(int num1, int num2) {
       int sum = num1 + num2;
       return sum;
    }
    
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 10;
       int result = add(num1, num2);
       System.out.println("Result is: " + result);
    }
 }

// using static variables :

public class j_a1 {
    static int num1;
    static int num2;
    
    public static int add() {
       return num1 + num2;
    }
    
    public static void main(String[] args) {
       num1 = 5;
       num2 = 10;
       int result = add();
       System.out.println("Result is: " + result);
    }
 }
 
 