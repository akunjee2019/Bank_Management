package com.company;

public class Main {

    public static void main(String[] args) {
        Acc taufik_account = new Acc("123",220,"taufik","t@mail.com","01987260757");
        System.out.println(taufik_account.getAccount_number());
        System.out.println(taufik_account.getAccount_balance());


        taufik_account.deposit_money(100.00);
        taufik_account.withdrawal_money(50.00);
	// write your code here
    }
}
