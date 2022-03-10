/*Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
*/

class problem06
{
	public static void main(String args[])
	{
		int a = 125, b = 24, sum, mul,sub,div,mod;
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		mod = a % b;
		System.out.println(a+ " + " +b+" = "+sum);
		System.out.println(a+ " - " +b+" = "+sub);
		System.out.println(a+ " * " +b+" = "+mul);
		System.out.println(a+ " / " +b+" = "+div);
		System.out.println(a+ " % " +b+" = "+mod);
		
	}
}