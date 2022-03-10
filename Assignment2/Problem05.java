/*Write a Java program that takes two numbers as input and display the product of 
two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/
import java.util.*;
class Problem05
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = S.nextInt();
		int b = S.nextInt();
		int mul;
		mul = a * b;
		System.out.println(a+ " * " +b+" = "+mul);
		
		
	}
}