class Pattern14
{
	public static void main(String args[])
	{
		for(int i=5; i>=1; i--) //row 
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");//column
			}
			System.out.println();
		}
	}
}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java Pattern14.java
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
			