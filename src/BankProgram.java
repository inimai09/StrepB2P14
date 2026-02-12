public class BankProgram {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("Spongebob", 1000);

        acc1.CheckBalance();
        acc1.deposit(2000);
        acc1.CheckBalance();

    }
}
