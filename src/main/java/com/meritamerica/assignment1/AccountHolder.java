/**
 * This class represents an Account holder for MeritAmericaBank.
 * The account holder has instance variables (first, middle and last name,
 * and a Social Security Number). The holder also has an opening balance for
 * a Checking and Savings account.
 * */
package com.meritamerica.assignment1;
import java.util.*;
public class AccountHolder {
	
/* ****CONSTANTS ********/
private static final double CHECKING_RATE = 0.0001;
private static final double SAVINGS_RATE = 0.01;
	
/* *************** INSTANCE VARIABLES*******************/
/* Each instance of AccountHolder has one first_, middle_ and lastNme 
* and each account is created with an opening balance           
* */
private String firstName, middleName, lastName, ssn;
private double checkingAccountOpeningBalance, savingsAccountOpeningBalance;
private CheckingAccount Checking = new CheckingAccount(); 
private SavingsAccount Savings = new SavingsAccount();

/* ****************** Default constructor **************/
AccountHolder() {
	Scanner sc = new Scanner(System.in);
	System.out.println("First Name: ");
	this.firstName = sc.nextLine();
	System.out.println("Middle Name: ");
	this.middleName = sc.nextLine();
	System.out.println("Last Name: ");
	this.lastName = sc.nextLine();
	System.out.println("SSN: ");
	this.ssn = sc.nextLine();
	System.out.println("\n \tNEW CHECKING AND SAVINGS ACCOUNTS:\n");
	System.out.println("Enter Checking Opening Balance: ");
	this.checkingAccountOpeningBalance = sc.nextDouble();
	System.out.println("Enter Savings Opening Balance: ");
	this.savingsAccountOpeningBalance = sc.nextDouble();
	Checking.SetCheckingBalance(checkingAccountOpeningBalance);
	Savings.SetSavingsBalance(savingsAccountOpeningBalance);
	
}

/* This Constructor is used when we want to initialize instance attributes of 
 * * an account holder. */

public AccountHolder(String firstName, String middleName, String lastName, 
			         String ssn, double checkingAccountOpeningBalance, 
			         double savingsAccountOpeningBalance)
{
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.ssn = ssn;
	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;		
	
	Checking.SetCheckingBalance(checkingAccountOpeningBalance);
	Savings.SetSavingsBalance(savingsAccountOpeningBalance);
}
		
/* ********* Getters definition ****************/
public String getFirstName(){ return firstName;}
public String getMiddleName(){ return middleName;}
public String getLastName(){ return lastName;}
public String getSSN(){ return ssn;}
public double getCheckingAccount(){ return checkingAccountOpeningBalance;}
public double getSavingsAccount(){ return savingsAccountOpeningBalance;} 

/* ********* Setters definition ***************/
public void setFirstName(String name){ firstName = name;}
public void setMiddleName(String midName){ middleName = midName;}
public void setLastName(String last_Name){ lastName = last_Name; }
public void setSSN(String social){ ssn = social;}


/* ****** toString() method to return a description of the Account Holder ********/
public String toString() {
	return   "Name: "+getFirstName() + " "+getMiddleName()+" " +getLastName() +
		     "\nSSN: "+getSSN()+
		     "\nChecking Account Balance: $"+Checking.getCheckingBalance() +
		     "\nChecking Account Interest Rate: " +CHECKING_RATE +
		     "\nChecking Account Balance in 3 years: "+Checking.futureValue(3) +
		     "\nSavings Account Balance:" +Savings.getSavingsBalance() +
		     "\nSavings Account Interest Rate: "+SAVINGS_RATE +
		     "\nSavings Account Balance in 3 years:"+Savings.futureValue(3);
	         
     }
}
