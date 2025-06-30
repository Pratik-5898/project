package com.simple;

public class BankAccount {
	String accountNumber;
	String accountHolder;
	double balance;
	static String bankName;
	
	BankAccount(String accountNumber,String accountHolder,double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	BankAccount(){
		this.accountHolder="unknown";
		this.accountNumber="unknown";
		this.balance=0.0;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
		}	
	}
	
	void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -=amount;	
		}		
	}
	void printAccountDetails() {
		System.out.println("Account Holder:" + accountHolder);
		System.out.println("account Number:" + accountNumber);
		System.out.println("balance:" + balance);
		System.out.println("balance:" + bankName);
		
	}
	static void setBankName(String name){
		bankName =name;
		
	}
	public static void main(String[] args) {
		BankAccount.setBankName("SBI");
		
		BankAccount acc1=new BankAccount("675226","Pratik",3000.0);
		acc1.deposit(700);
		acc1.withdraw(300);
		acc1.printAccountDetails();
		
		//BankAccount acc2=new BankAccount();
		//acc2.printAccountDetails();
		
		
	}

	


	
	

}
