import java.util.*;
class ArrayOperations{
	void input(float x[])
	{
		Scanner sc = new Scanner(System.in);
		for(int index=0;index<x.length; index++)
		{
			x[index] = sc.nextFloat();
		}
	}	
	float average(float x[])
	{
		float avg=0;
		for(int i=0;i<x.length;i++)
		{
			avg =  avg+ x[i];
		}
		return(avg);
	}
}
public class Average_using_array{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s = sc.nextInt();
		float[] arr= new float[s];
		ArrayOperations obj = new ArrayOperations();
		obj.input(arr);
		float avg = obj.average(arr)/s;
		System.out.print("The average of given numbers is :" +avg);
	}
}