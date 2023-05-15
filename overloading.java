import java.util.Scanner;
class familyAge
{
    Scanner sc =new Scanner(System.in);
    void age()
    {
        System.out.println("DO you know your grandfather's age : YES/NO");
        String ans = sc.nextLine();
        String a ="YES",b="NO";
        if(ans.equalsIgnoreCase(a))
            {
                System.out.print("Enter the age : ");
                int age = sc.nextInt();
                System.out.println("\nGrandfather's age is :"+age);
            }
        else if(ans.equalsIgnoreCase(b))
            System.out.println("Grandfather's age is unknown");
        else
            System.out.println("You have entered wrong input");
    }
    void age(int x,int y)
    {
        System.out.println("Father's age is :"+x+" Mother's age is :"+y);
    }
    void age(int x)
    {
        System.out.println("My age is :"+x);
    }
}
class overloading
{
    public static void main(String []aj)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("\nEnter your age :");
        int n = sc.nextInt();
        System.out.print("Enter the Father's and Mother's age respectively : ");
        int f = sc.nextInt();
        int m = sc.nextInt();
        familyAge obj = new familyAge();
        obj.age();
        obj.age(f,m);
        obj.age(n);
    }
}
