import java.util.Scanner;
class ATM
{
	public static void main(String args[])
	{
	 int balance = 50000;
	 int withdraw,deposit;
	 Scanner sc = new Scanner(System.in);
	 while(true)
	 {
		System.out.println("Welcome to R-CAT ATM.. ");
		System.out.println("Happy to help you please choose option by sequnce book ");
		System.out.println("(1): withdraw ");
		System.out.println("(2): deposit ");
		System.out.println("(3): check balace ");
		System.out.println("(4): exit  ");
		System.out.println("Press your choice here: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:	System.out.println("Enter money to be withdrawn: ");
			withdraw = sc.nextInt();
			if(balance>=withdraw)
			{
				balance = balance-withdraw;
				System.out.println("please collect your money ");
			}else
			{
				System.out.println("insufficient Balance");
			}	break;
		
		case 2: System.out.println("enter moneyy to be deposited");
			deposit= sc.nextInt();
			balance= balance+deposit;
			System.out.println("your money has been deposit");
			System.out.println(" ");
			
		case 3: System.out.println("balance:" +balance);
		System.out.println(" ");
		break;
		
		case 4: System.exit(0);

		}
	 }
 }
}