class exceptionHandling
{
    public static void main(String []aj)
    {
        int array[] = {1,2,3,4,5};
        String s = null;
        try{
            int a = 10/0;
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
        System.out.println("After 1st exception program is still executing");
        try{
                System.out.println(array[15]);

        }
        catch(Exception e)
        {
                System.out.println(e);

        }
        System.out.println("After 2nd exception program is still executing");
        try{
                System.out.println(s.length());
        }
        catch(Exception e)
        {
                System.out.println(e);
        }
                System.out.println("After 3rd exception program is still executing");
    }
}
