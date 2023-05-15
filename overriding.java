class parent
{
    void show()
    {
        System.out.println("Parent is in control");
    }
}
class child extends parent
{
    void show()
    {
        System.out.println("Child has overridden the controls");
    }
}
class overriding
{
    public static void main(String []aj)
    {
        parent obj1 = new parent();
        parent obj2 = new child();
        obj1.show();
        obj2.show();
    }
}

