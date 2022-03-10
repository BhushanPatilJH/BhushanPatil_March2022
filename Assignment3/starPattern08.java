class starPattern08
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java starPattern08.java
*
**
***
****
*****
****
***
**
*
--------
*/