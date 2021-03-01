package com.meritamerica.assignment1;

public class SavingsAccount {
	
/* Constructors *******/
public SavingsAccount() {
}
public SavingsAccount(double opening_Balance) {
		  savingsBalance = opening_Balance;
	}
/* ****** CONSTANTS and INSTANCE VARIABLES*******/
private double savingsBalance;
private static final double INTEREST_RATE = 0.01;
	
/* ******** METHODS **********/ 
/* ** Setter and Getter **/
public void SetSavingsBalance(double Balance) { this.savingsBalance = Balance;}
public double getSavingsBalance() { return savingsBalance;}
/* *****************************/

boolean deposit(double amount) {
	if (amount >0)
	   savingsBalance +=amount;
	return true;
   }

boolean withdraw(double amount) {
	if(amount < savingsBalance)
	  savingsBalance -= amount;
	  return true;
	}
double getInterestRate() {return INTEREST_RATE;}
	
double futureValue(int years){
		double FV = savingsBalance * Math.pow((1 + INTEREST_RATE), years);
		return FV;
		}
public String toString() {
	return "Savings Account Balance: $" + getSavingsBalance() +
			"\nSavings Account Interest Rate: " +INTEREST_RATE +
			"\nSavings Account Balance in 3 years: " +futureValue(3);		
	}	
}