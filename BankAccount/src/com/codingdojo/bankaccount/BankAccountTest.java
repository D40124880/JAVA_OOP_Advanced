package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acctA = new BankAccount();
		System.out.println("This is the first account " + acctA);
		acctA.setCheckingBal(200.00);
		acctA.setSavingsBal(1000.00);
		System.out.println("This is the first account " + acctA + "\n");
		
		acctA.despositMoney("Checking", 65.50);
		acctA.despositMoney("Savings", 500.55);
		System.out.println("This is after a desposit " + acctA + "\n");
		
		acctA.withdrawMoney("Checking", 10.25);
		acctA.withdrawMoney("Savings", 100.72);
		acctA.display();
		
		BankAccount acctB = new BankAccount();
		System.out.println("This is the second account " + acctB);
		acctB.setCheckingBal(150.00);
		acctB.setSavingsBal(10000.00);
		System.out.println("This is after setting the second bank account " + acctB);
		acctB.displayAll();
	}
}
