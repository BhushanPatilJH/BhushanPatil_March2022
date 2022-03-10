class Pattern16
{
	public static void main(String args[])
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*OUTPUT
C:\CDAC2022\Assignments\Assign3>java Pattern16.java
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
	