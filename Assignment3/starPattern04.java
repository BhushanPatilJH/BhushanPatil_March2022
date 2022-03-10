class starPattern04
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j>=2; j--)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=5; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java starPattern04.java
*****
 ****
  ***
   **
    *
*/