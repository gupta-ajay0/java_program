import java.util.Scanner;
class AreaOfRectangle
{
	float ibre,ilen,iarea; //instance variables 
	void AreaCal()
	{
		Scanner sc = new Scanner(System.in);
		AreaOfRectangle s = new AreaOfRectangle();
		System.out.print("Enter the length of Rectangle :");
		s.ilen = sc.nextFloat();
		System.out.print("Enter the width of Rectangle:");
		s.ibre = sc.nextFloat();
		s.iarea = s.ilen*s.ibre; 
		System.out.println("The area of rectangle using instance variables :"+ s.iarea);

	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		AreaOfRectangle s = new AreaOfRectangle();
		float llen,lbre,larea;  //local variables
		System.out.println("");
		System.out.print("Enter the length of Rectangle :");
		llen = sc.nextFloat();
		System.out.print("Enter the width of Rectangle :");
		lbre = sc.nextFloat();
		larea = llen*lbre; 
		System.out.println("The area of rectangle using local variables :"+ larea);
		s.AreaCal();
	}
	
}