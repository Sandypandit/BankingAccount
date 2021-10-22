package com.bridgelabz;

public class SavingsAccount {
	static int annualInterestRate;
    private int savingsBalance;

    public void calculateMonthlyInterest(){ //calculating monthly interest
        int monthlyInterest = (savingsBalance*annualInterestRate)/12;
        System.out.println("monthly interest"+monthlyInterest);
    }

    public void modifyInterestRate(){ //modifying interest rate
    	annualInterestRate = savingsBalance*(4/100);
    	this.annualInterestRate = annualInterestRate;
    }
    
    public SavingsAccount(int savingsBalance) {
    	this.savingsBalance = savingsBalance;
    }
    public static void main(String[] args) {
    	SavingsAccount saver1 = new SavingsAccount(2000);
    	SavingsAccount saver2 = new SavingsAccount(3000);
    	
    	saver1.modifyInterestRate();
    	saver1.modifyInterestRate();
    	
    	saver1.calculateMonthlyInterest();
		saver1.calculateMonthlyInterest();
    	
	} 

}
