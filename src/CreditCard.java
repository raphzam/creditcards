public class CreditCard {

//    Instance variables

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

//    Constructors

    public CreditCard(String customer, String bk, String account, int limit, double initialBal) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBal;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0); // calling other constructor
    }

//    Accessor methods

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

//    Update methods

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit)
            return false;   //refuse charge
        balance += price;   //update the balance if charge is successful
        return true;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account); //account
        System.out.println("Balance = " + card.balance); //balance
        System.out.println("Limit = " + card.limit); //limit
    }


}
