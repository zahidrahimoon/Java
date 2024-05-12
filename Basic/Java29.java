public class Java29 {
    public static class BankAccount {
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            } else {
                System.out.println("Invalid balance! Balance cannot be negative.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000.0);
        System.out.println("Current Balance: $" + account.getBalance());

    }
}
