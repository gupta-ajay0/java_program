import java.util.Scanner;
interface a
{
    int id=1234;
    void display();
}
interface b
{
    String name = "ajay";
    void disp();
}
class c implements a,b
{
    public void display()
    {
        System.out.println("The id is "+id);
    }
    public void disp()
    {
        System.out.println("The name is "+name);
    }
}
class inheritence2
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        c obj = new c();
        System.out.println("enter the name :");
        obj.id = sc.nextInt();
        obj.display();
        obj.disp();
    }
}
