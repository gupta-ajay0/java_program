public class Average_i_l {
	int ia1 = 13, ia2 = 10, ia3 = 15;   //instance
	public static void main(String args[]) 
	{
      	int a1 = 12, a2 = 13, a3 = 14;  //local
      	float average = (a1 + a2 + a3) / 3;
      	System.out.println("The average using local :"+average);
		Average_i_l obj = new Average_i_l();
      	float iaverage = (obj.ia1 + obj.ia2 + obj.ia3) / 3;
		System.out.println("The average using instance :"+iaverage);
    }
}