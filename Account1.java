import java.util.Scanner;

public class Account1
{
        public double balance;

      	
  	    public void deposit( double amount )
	{
		balance += amount;
	}

        public double withdraw( double amount )
	{
                // See if amount can be withdrawn
		if (balance >= amount)
		{
			balance -= amount;
                        return amount;
		}
		else
                // Withdrawal not allowed
                        return 0.0;
	}

        public double getbalance()
	{
                return balance;
	}


public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);

        	// Create an empty account
        	Account1 my_account[] = new Account1[5];
		
		for(int i=0;i<5;i++){

		my_account[i]=new Account1();
                // Deposit money
		System.out.print("Enter the amount that you want to deposit:");
       		
		double deposit_amount = in.nextDouble();      // Read one line from the console.
		my_account[i].deposit(deposit_amount);

                // Print current balance
		System.out.println ("Current balance after deposit the amount" + my_account[i].getbalance());


                // Withdraw money
		System.out.print("Enter the amount that you want to withdraw:");
		double witdraw_amount = in.nextDouble();      // Read one line from the console.
		my_account[i].withdraw(witdraw_amount);

                // Print remaining balance
		System.out.println ("Remaining balance after withdrawing the amount" + my_account[i].getbalance());
		}
	}


}
