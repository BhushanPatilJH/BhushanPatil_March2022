/*Write a Java program that takes a number as input and prints its multiplication 
table upto 10. 
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.*;
class Problem07
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		for(int i = 1;i <=10 ;i++)
		System.out.println(n+ " * " +i+" = "+(n * i));
		
	}
}