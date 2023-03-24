import java.util.Scanner;
class SI
{
	float ip,irate,itime,ires; //instance variables 
	void SimpleIntrestCal()
	{
		Scanner sc = new Scanner(System.in);
		SI s = new SI();
		System.out.println("Simple Intrest using instance variable.");
		System.out.print("Enter the principal amount for :Rs");
		s.ip = sc.nextFloat();
		System.out.print("Enter the rate of intrest(%) :");
		s.irate = sc.nextFloat();
		System.out.print("Enter the time period(year) :");
		s.itime = sc.nextFloat();
		s.ires = (s.ip*s.itime*s.irate)/100; 
		System.out.println("The Simple intrest using instance variables :"+ s.ires);

	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		SI s = new SI();
		float lp,lrate,ltime,lres;  //local variables
		System.out.println("Simple Intrest using local variable.");
		System.out.print("Enter the principal amount for :Rs");
		lp = sc.nextFloat();
		System.out.print("Enter the rate of intrest(%) :");
		lrate = sc.nextFloat();
		System.out.print("Enter the time period(year) :");
		ltime = sc.nextFloat();
		lres = (lp*ltime*lrate)/100; 
		System.out.println("The Simple intrest using local variables :"+ lres);
		s.SimpleIntrestCal();
	}
	
}