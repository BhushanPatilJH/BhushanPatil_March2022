class starPattern02
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java starPattern02.java
    *
   **
  ***
 ****
*****

*/