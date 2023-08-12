import java.util.Scanner;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount)
    {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else
        {
            return false;
        }
    }
}

class ATM {
    private BankAccount bankAccount;
    Scanner sc = new Scanner(System.in);
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.sc = new Scanner(System.in);
        System.out.println("Welcome to my second task i.e. ATM INTERFACE!");
        System.out.println("ATM INTERFACE");
    }

    public void displayOptions()
    {
        System.out.println("ATM Options:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void performOption(int choice)
    {
        switch (choice) {
            case 1:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                boolean success = bankAccount.withdraw(withdrawAmount);
                if (success)
                {
                    System.out.println("Successfully withdrawn $" + withdrawAmount);
                } else
                {
                    System.out.println("Insufficient balance. Unable to withdraw $" + withdrawAmount);
                }
                break;

            case 2:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = sc.nextDouble();
                bankAccount.deposit(depositAmount);
                System.out.println("Successfully deposited $" + depositAmount);
                break;

            case 3:
                double balance = bankAccount.getBalance();
                System.out.println("Your balance is $" + balance);
                break;


            case 4:
                System.out.println("Thank you for visiting. bye!");
                System.exit(4);
                break;

            default:
                System.out.println("Oops! Invalid choice. Please try again.");
        }
    }

    public void run() {
        while (true) {
            displayOptions();
            System.out.print("choose and enter a number to proceed further : ");
            int choice = sc.nextInt();
            performOption(choice);
            System.out.println();
        }
    }
}

public class ATMINTERFACE {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(15000);

        ATM money = new ATM(bankAccount);
        money.run();
    }
}