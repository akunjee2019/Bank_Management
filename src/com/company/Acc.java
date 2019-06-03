package com.company;

public class Acc {
    private String account_number;
    private double account_balance;
    private String users_name;
    private String users_email;
    private String users_phno;

    public Acc(){
        System.out.println("Constructor has not called"); //first constructors has called here
    }
    public Acc(String account_number,double account_balance, String users_name,String users_email,String users_phno){
        this.account_number = account_number;
        this.account_balance = account_balance;
        this.users_name = users_name;
        this.users_email = users_email;
        this.users_phno = users_phno;
    }

    public void deposit_money(double deposit){
        this.account_balance += deposit;
        System.out.println("Deposit "+deposit+" made . new balance is "+ this.account_balance);
    }

    public void withdrawal_money(double withdrawal){
        if(this.account_balance - withdrawal <=0 ){
            System.out.println("Only "+ this.account_balance + "available. withdrawal not processed.");
        }else{
            this.account_balance -= withdrawal;
            System.out.println("Withdrawal "+ withdrawal +" Processed. Remaining Balance "+ this.account_balance);
        }
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public String getUsera_email() {
        return users_email;
    }

    public void setUsera_email(String usera_email) {
        this.users_email = usera_email;
    }

    public String getUsers_phno() {
        return users_phno;
    }

    public void setUsers_phno(String users_phno) {
        this.users_phno = users_phno;
    }
}
