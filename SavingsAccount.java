package com.bridgelabz;

class SavingsAccount{
	
	static int annualInterestRate;
    private int savingsBalance;


    public void calculateMonthlyInterest(){
        int monthlyInterest = (savingsBalance*annualInterestRate)/12;
		savingsBalance += monthlyInterest;
    }

    public void modifyInterestRate(int annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }


	public static void main(String[] args) {
		
	}
}
