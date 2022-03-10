class starPattern06
{
	public static void main(String args[])
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i+1; j--)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print("*");
			}
			for(int l=i; l>=2; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java starPattern06.java
*********
 *******
  *****
   ***
    *
*/