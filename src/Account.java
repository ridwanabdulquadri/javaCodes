public class Account {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private double balance;
    public void deposit(double amount){
        balance = balance + amount;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
