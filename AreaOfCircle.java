import java.util.Scanner;
class AreaOfCircle
{
	float iradius,iarea; //instance variables 
	void AreaCal()
	{
		Scanner sc = new Scanner(System.in);
		AreaOfCircle s = new AreaOfCircle();
		System.out.print("Enter the radius of the circle :");
		s.iradius = sc.nextFloat();
		s.iarea = (3.14f)*(s.iradius) * (s.iradius);
		System.out.println("The area of circle using instance variables :"+ s.iarea);

	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		AreaOfCircle s = new AreaOfCircle();
		float lradius,larea;  //local variables
		System.out.println("");
		System.out.print("Enter the radius of the circle :");
		lradius = sc.nextFloat();
		larea = (3.14f)*lradius * lradius;
		System.out.println("The area of circle using local variables :"+ larea);
		s.AreaCal();
	}
	
}