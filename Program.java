//import stuff here
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner intScanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        num1 = intScanner.nextInt();
        System.out.print("\nEnter number 2: ");
        num2 = intScanner.nextInt();
        System.out.println("\nOriginal numbers are " + num1 + " and " + num2);
        int sum = num1 +num2;
        System.out.println("\nSum = " + sum);
        int difference = num1 - num2;
        System.out.println("\nDifference = " +difference);
        int product = num1*num2;
        System.out.println("\nProduct = " + product);
        double average = (double) (num1+num2)/2;
        System.out.println("\nAverage = " + average);
        int absoluteVal = Math.abs(difference);
        System.out.println("\nAbsolute value = " + absoluteVal);
        int min = (Math.abs(sum)+difference)/2;
        int max = (Math.abs(difference)+sum)/2;
        System.out.println("\nMaximum = " + max);
        System.out.println("\nMinimum = " + min);
    }
}
//Paste console output below:
/*

Enter number 1: 13

Enter number 2: 20

Original numbers are 13 and 20

Sum = 33

Difference = -7

Product = 260

Average = 16.5

Absolute value = 7

Maximum = 20

Minimum = 13

*/
