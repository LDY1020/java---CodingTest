package CoadingMatter.ex6;

public class BankAccount {

    String name;
    int balance;
    static int totalAccounts;

    BankAccount(String name , int balance){
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    public int deposit(int amount){
        balance += amount;
        System.out.println("입금완료 , 현자 잰액 : " + balance);
        return balance;
    }

    public int withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액 부족");
        }
        else if(balance > amount){
            balance -= amount;
            System.out.println("출금완료 , 현재 잔약 : " + balance);

        }
        return balance;
    }
}
