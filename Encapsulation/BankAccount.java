public class BankAccount {

    // private fields
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // setter for account holder
    public void setBalance(double balance) {
        if(balance < 0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    // setter for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public static void main(String[] args){
        BankAccount b1 = new BankAccount();

        b1.setAccountNumber("12345678956841");
        b1.setBalance(900000000.00);
        b1.setAccountHolderName("Md Ataurrab");


        System.out.println("Account Number: " + b1.getAccountNumber());
        System.out.println("Account Holder Name: " + b1.getAccountHolderName());
        System.out.println("Account Balance: $" + b1.getBalance());
    }
}