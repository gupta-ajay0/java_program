class swap {
	public static void main(String args[]) 
	{
      	int a=5,b=7;
		System.out.println("Before swap : a = "+ a +" b =" + b);
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println("After swap : a = "+ a +" b =" + b);
    	}
}