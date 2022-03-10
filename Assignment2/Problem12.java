/*12. Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers. */
import java.util.*;
class Problem12
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the tree calculate average : ");
		int n1 = S.nextInt();
		int n2 = S.nextInt();
		int n3 = S.nextInt();
		float avg =(n1 + n2 + n3)/3.0f;
		System.out.println("Average = "+avg);
	}
}