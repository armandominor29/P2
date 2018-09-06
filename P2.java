import java.util.Scanner;

/**Created by armandominor on 11/1/15.**/
//Creates a new account and takes inputs from user to update account information


public class P2
{
    public static void main(String[] args)
    {
        //Create a new account

        Account myAccount = new Account();

        Scanner input = new Scanner(System.in);

        int idInput;                    //initialize idInput
        double balanceInput;            //initialize balanceInput
        double annualInterstRateInput;  //initialize annualInterestrateInput
        double withdrawalAmount;        //initialize withdrawalAmount
        double depositAmount;           //initialize depositAmount

        System.out.println("Enter id number:");

        idInput = input.nextInt(); //take input from user and set value to idInput

        myAccount.setId(idInput);

        System.out.println("\nEnter desired balance amount:");

        balanceInput = input.nextDouble(); //take input from user and set value to balanceInput

        myAccount.setBalance(balanceInput);

        System.out.println("\nEnter desired annual interest rate:");

        annualInterstRateInput = input.nextDouble(); //take input from user and set value to annualInterestRateInput

        myAccount.setAnnualInterestRate(annualInterstRateInput);

        System.out.println("\nEnter amount for withdrawal:");

        withdrawalAmount = input.nextDouble(); //take input from user and set value to withdrawalAmount

        myAccount.withdrawal(withdrawalAmount);

        System.out.println("\nEnter amount for deposit:");

        depositAmount = input.nextDouble(); //take input from user and set value to depositAmount

        myAccount.deposit(depositAmount);

        //Print values for balance, monthlyInterest, and dateCreated

        System.out.println("\nCurrent balance: " + myAccount.getBalance()
                + "\nMonthly interest: " + myAccount.getMonthlyInterest()
                + "\nAccount created on: " + myAccount.dateCreated);


    }
}
