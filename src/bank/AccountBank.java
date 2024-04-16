package bank;

public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with default values
    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Số dư không thể âm.");
        } else {
            this.balance = balance;
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Gửi tiền thành công. Số dư mới: " + balance);
        } else {
            System.out.println("Số tiền gửi không hợp lệ.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Rút tiền thành công. Số dư mới: " + balance);
            } else {
                System.out.println("Số dư không khả dụng.");
            }
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    // Method to transfer money from one account to another
    public void transfer(AccountBank destinationAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                destinationAccount.deposit(amount);
                System.out.println("Chuyển thành công. Số dư mới: " + balance);
            } else {
                System.out.println("Số dư không đủ để chuyển khoản.");
            }
        } else {
            System.out.println("Số tiền chuyển không hợp lệ.");
        }
    }
}