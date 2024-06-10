import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if(amount>0){
            this.balance += amount;
            return true;
        }else{
            System.out.println("Invalid amount for deposit");
            return false;
        }
    }

    public boolean withdraw(double amount){
        if(amount > 0 && amount<= balance){
            this.balance -= amount;
            return true;
        }else{
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
            return false;
        }
    }

    public double checkBalance(){
        return balance;
    }
}

class ATM{
    private BankAccount account;
    private Scanner scanner;
    public ATM(BankAccount account){
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("\nATM Menu");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }

    public void run(){
        while(true){
            displayMenu();
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if(account.deposit(depositAmount))
                        System.out.println("Deposit Successfull.Current Balance :" + account.checkBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if(account.withdraw(withdrawAmount))
                        System.out.println("Withdrawal successfull.Current Balance: " + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
public class task3 {
    public static void main(String[] args) {
        double initialBalance = 1000;
        BankAccount account = new BankAccount(initialBalance);
        ATM atm = new ATM(account);
        atm.run();
    }
}
