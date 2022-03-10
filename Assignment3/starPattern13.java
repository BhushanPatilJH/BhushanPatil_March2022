class starPattern13
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java starPattern13.java
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/