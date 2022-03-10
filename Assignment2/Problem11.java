/*11. Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.7145867644258 */
class Problem11
{
	public static void main(String args[])
	{
		double r=7.5;
	    double Pi = 3.142857142857143;
		System.out.println("Perimeter is = "+(2*Pi*r));
		System.out.println("Area is = "+(Pi*r*r));
	}
}