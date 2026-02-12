public class BankAccount {
    private String AccountHolder;
    private double balance;

    public BankAccount(String name, double initial_balance){
        this.AccountHolder = name;
        this.balance = initial_balance;

    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited:" + balance);

    }
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("Insufficient balance");
        }else{
            balance = balance - amount;
            System.out.println("Withdrawn:" + amount);
        }
    }
    public void CheckBalance(){
        System.out.println("Your current balance is:" + balance);
    }
}
