
import java.util.Scanner;

public class j_p_ass3 {

    public static void main(String[] args) {
        float Fahrenheit,Celsius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Fahrenheit : ");
        Fahrenheit = sc.nextFloat();
        Celsius = (float)((Fahrenheit - 32)*(0.5556));
        System.out.println("Input Celsius : " + Celsius); 
}}
/* Input Fahrenheit : 212
   Input Celsius : 100.008
 * 
 */