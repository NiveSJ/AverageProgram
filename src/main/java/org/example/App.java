package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      int a,b,c;
      float  Result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Three number to average");
        a  = scan.nextInt();
        b  = scan.nextInt();
        c  = scan.nextInt();
        Result= (a+b+c)/3;

        System.out.println( "Average is:" +Result );
    }
}
