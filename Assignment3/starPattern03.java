class starPattern03
{
	public static void main(String args[])
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java starPattern03.java
*****
****
***
**
*

*/