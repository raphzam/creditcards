import java.util.Random;
import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

//        Declare variables
        //customer, bank, account, limit, balance

        String customer, bank, account;
        int limit;
        double balance;

        System.out.println("Welcome to account creation");

        System.out.println("What is the customer name?");
        customer = input.nextLine();

        System.out.println("What is the bank name?");
        bank = input.nextLine();

        System.out.println("What is the bank account number?");
        account = input.nextLine();

        System.out.println("What is the account limit?");
        limit = input.nextInt();

        System.out.println("What is the account balance");
        balance = input.nextDouble();

        CreditCard card = new CreditCard(customer, bank, account, limit, balance);

        System.out.println(card.toString());


    }

}
