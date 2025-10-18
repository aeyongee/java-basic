package oop1.ex;

public class Account {
    int balance;

    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    void withdraw(int amount) {
        if(balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    void showBalance() {
        System.out.println("잔고: " + balance);
    }
}
