import java.util.Scanner;

public class j_p_ass2 {

    public static void main(String[] args) {

        int x,y,sum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a number : ");
            x=sc.nextInt();
            System.out.print("Input another number : ");
            y=sc.nextInt();
        }
        sum=x+y;
        System.out.println("the total :" + sum);
        }
}
/* 
Input a number : 7
Input another number : 8
the total :15 
*/