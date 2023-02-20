import java.util.Scanner;

public class j_p_ass1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input your first name : ");
        String fname = input.next();
        System.out.print("input your last name : ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello " + fname + " " + lname);
    }
}
/*
 * input your first name : sandipan
   input your last name : pradhan

   Hello sandipan pradhan
 */