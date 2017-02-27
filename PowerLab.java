//Andrew LaRoche
// CS310 Ackermann's Function lab
// 3/13/15


/**
 * This program demonstrates the power method
 */

import java.util.Scanner;

public class PowerLab
{
  
  public static void main(String[] args)
  {
    int num;
    int exp;
    
    Scanner input = new Scanner(System.in);
    
//Reading in user input and storing them as  num and exp to be calculated.
    
    System.out.println("Please enter a base integer");
    num = input.nextInt();
    
    System.out.println("Please enter the power you will be raising the base to.");
    exp = input.nextInt();

//takes the result of the aforementioned inputs and passes it in the power method to be displayed
    System.out.println(num +" " + "to the power of" + " " + exp + " " + "is" + " " + num * power(num,exp-1));
  }
/**
 * The power method takes a base and raises it to an exponential power
 * @param num The base number
 * @param exp The exponent in which the base number(num) will be raised to
 * @return The result of the base(num) being raised to the exponent(exp)
 */ 
  public static int power(int num,int exp)
    {
     if (exp == 0)
     {
       return 1;
     }
     else
     {
       return num * power(num,exp-1);
    }
 }
}