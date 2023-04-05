import java.util.Scanner;
class Atm_Operation
{
    int balance=1000;
    int pass=1234;
    void bal()
    {
            System.out.println("\n The balance in your account is : Rs "+balance);

    }
    void withdrawl(int x)
    {
        int amt=x;
        if(amt>balance)
            System.out.println("Account does not have enough balance");
        else{
            balance =balance - amt;
            System.out.println("Rs "+ amt +" has been withdrawn");
        }
    }
    void pinVer()
    {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if(pass != pin)
        {
            System.out.println("!! INCORRECT PIN. TRY AGAIN. !!");
            System.exit(0);
        }
    }
}
class ATM
{

    public static void main(String []aj)
    {
        int ch = 0;
        Atm_Operation obj = new Atm_Operation();
        Scanner sc = new Scanner(System.in);
        System.out.println("!!  WELCOME TO THE ATM !!");
        System.out.println("Enter your pin.");
        obj.pinVer();
        while(ch != 3 )
        {

            System.out.println("ENTER 1 TO CHECK BALANCE.");
            System.out.println("ENTER 2 TO WITHDRAW MONEY.");
            System.out.println("ENTER 3 TO EXIT.");
            ch =sc.nextInt();
            if(ch== 1)
            {

                obj.bal();
            }
            else if(ch== 2 )
            {
                System.out.println("\n Enter the amount : ");
                int amt = sc.nextInt();
                obj.withdrawl(amt);
            }
            else if(ch== 3 )
            {
                System.out.println("**THANK YOU FOR USING. VISIT AGAIN.**");
            }
            else
                System.out.println("\n ! SOMETHING WENT WRONG. TRY AGAIN.");
        }



    }
}
