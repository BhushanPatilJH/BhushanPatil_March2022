/*15. Write a Java program to swap two variables.*/
import java.util.*;
class Problem15
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the two new number: ");
		int n1 = S.nextInt();
		int n2 = S.nextInt();
		System.out.println("Number Before Swap n = "+n1+"  n2 = "+n2);
		int temp = n1;
		    n1 = n2;
			n2 = temp;
		System.out.println("Number After Swap n = "+n1+"  n2 = "+n2);
	}
}