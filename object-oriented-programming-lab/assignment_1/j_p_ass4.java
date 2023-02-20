//Write a Java Program to change temperature to Celsious from fahrenheit?

import java.util.Scanner;

public class j_p_ass4 {

    public static void main(String[] args) {
        float Fahrenheit,Celsius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Celsius : ");
        Celsius = sc.nextFloat();
        Fahrenheit = (float)((Celsius*(1.8))+32);
        System.out.println("Output Fahrenheit : " + Fahrenheit); 
}}

/* 
 * Input Celsius : 100 
   Output Fahrenheit : 212.0
 */