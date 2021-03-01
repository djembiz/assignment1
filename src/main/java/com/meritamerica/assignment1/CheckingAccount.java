/**
 * This Class represents a typical Checking Account for MeritAmeriaBank.
 * Each account has an INTEREST_RATE that is static, and a Balance that is 
 * proper to each account. The openingBalance is the balance at opening.
 */
package com.meritamerica.assignment1;
import java.lang.Math;

public class CheckingAccount {
/* ****** CONSTANTS and INSTANCE VARIABLES*******/
private double checkingBalance; //Instance Variable
private static final double INTEREST_RATE = 0.0001;	
	
/* ****** Class Constructor **********/
public CheckingAccount() {
}
public CheckingAccount(double openingBalance) {
		  checkingBalance = openingBalance;
	}
	
/* ******** METHODS **********/ 
/* ** Setter and Getter **/
public void SetCheckingBalance(double Balance) { this.checkingBalance = Balance;}
public double getCheckingBalance() { return checkingBalance;}
/* ******************************/

boolean deposit(double amount) {
	if (amount<0) {
		System.out.println("Check for Negative amount");
	    return false;}
	else {
		checkingBalance +=amount;
	    return true;}
	  }
	
boolean withdraw(double amount) {
	if(amount >0 && amount < checkingBalance) {
	  checkingBalance -= amount;
	  return true;}
    else {
    	System.out.println("Check for Negative amount or Unsufficient funds");
	    return false;}
    	
 }
 /* ***** Class Methods definition ********/
public double getBalance() { return checkingBalance;}
double getInterestRate() {return INTEREST_RATE;}
	
double futureValue(int years){
	double FV = checkingBalance * Math.pow((1 + INTEREST_RATE), years);
	return FV;
}
	
public String toString() {
		return "Checking Account Balance: $" + getBalance() +
				"\nChecking Account Interest Rate: " +INTEREST_RATE +
				"\nChecking Account Balance in 3 years: " +futureValue(3);

}
/* **End Methods definition ****/
}
	
	
	





