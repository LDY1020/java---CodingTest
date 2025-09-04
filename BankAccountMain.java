package CoadingMatter.ex6;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[3];

        bankAccounts[0] = new BankAccount("도윤" , 10000);
        bankAccounts[1] = new BankAccount("철수" , 20000);
        bankAccounts[2] = new BankAccount("유리" , 30000);

        bankAccounts[0].deposit());
        bankAccounts[0].withdraw(5000);
        System.out.println("------------------------------");

        bankAccounts[1].deposit(2000);
        bankAccounts[1].withdraw(4000);
        System.out.println("------------------------------");

        bankAccounts[2].deposit(7000);
        bankAccounts[2].withdraw(6000);
        System.out.println("------------------------------");

        int totalAccounts = BankAccount.totalAccounts;
        System.out.println(totalAccounts);


    }
}
