class BankAccount {
    private int balance = 1000; // Initial account balance

    // Synchronized method for deposit
    public synchronized void deposit(int amount) {
        System.out.println("Depositing $" + amount + " by " + Thread.currentThread().getName());
        balance += amount;
        System.out.println("New balance after deposit: $" + balance);
    }

    // Synchronized method for withdrawal
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Withdrawing $" + amount + " by " + Thread.currentThread().getName());
            balance -= amount;
            System.out.println("New balance after withdrawal: $" + balance);
        } else {
            System.out.println("Insufficient funds for " + Thread.currentThread().getName() + " to withdraw $" + amount);
        }
    }
}

class BankOperationThread implements Runnable {
    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    public BankOperationThread(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class BankingExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create three threads for deposit and withdrawal
        Thread depositThread1 = new Thread(new BankOperationThread(account, true, 200));
        Thread withdrawalThread1 = new Thread(new BankOperationThread(account, false, 150));
        Thread depositThread2 = new Thread(new BankOperationThread(account, true, 100));

        // Start the threads
        depositThread1.start();
        withdrawalThread1.start();
        depositThread2.start();

        try {
            // Wait for threads to finish
            depositThread1.join();
            withdrawalThread1.join();
            depositThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final account balance: $" + account.getBalance());
    }
}
