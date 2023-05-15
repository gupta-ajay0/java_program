import java.util.Scanner;
class marks
{
    Scanner sc = new Scanner(System.in);
    int m,s,e,h,c,sst;
    void input()
    {
        System.out.println("Enter the marks of the following subjects.(out of 150) ");
        System.out.print("DataBase Management System :");
        m = sc.nextInt();
        System.out.print("\nTheory Of Automata :");
        s = sc.nextInt();
        System.out.print("\nCyber Security :");
        e = sc.nextInt();
        System.out.print("\nObjected Oriented Programing :");
        h = sc.nextInt();
        System.out.print("\nOperating System :");
        c = sc.nextInt();
        System.out.print("\nDataStructure Algorithms And Analysis :");
        sst = sc.nextInt();
    }
}
class average extends marks
{
    int a;
    void avrg()
    {
        a = (m+s+h+e+c+sst);
        System.out.println("The average mark is : "+(a/6));
    }
}
class percentage extends average
{
    void per()
    {
        float p = a/9;
        System.out.println("The percentage is :"+p);
    }
}
class inheritence3
{
    public static void main(String []aj)
    {
        percentage obj = new percentage();
        obj.input();
        obj.avrg();
        obj.per();
    }
}
