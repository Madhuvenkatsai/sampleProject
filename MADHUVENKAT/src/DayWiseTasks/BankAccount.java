package DayWiseTasks;

public class BankAccount {
        private int accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + " deposited successfully.");
            } else {
                System.out.println("Deposit amount must be greater than zero.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println(amount + " withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Withdrawal amount must be greater than zero.");
            }
        }

        public double checkBalance() {
            return balance;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public static void main(String[] args) {
            BankAccount account = new BankAccount(245656, "John Doe", 1000.0);
            System.out.println("Account holder: " + account.getAccountHolderName());
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Initial balance: " + account.checkBalance());

            account.deposit(500.0);
            System.out.println("Current balance after deposit: " + account.checkBalance());

            account.withdraw(200.0);
            System.out.println("Current balance after withdrawal: " + account.checkBalance());

            account.withdraw(2000.0);
        }
    }


