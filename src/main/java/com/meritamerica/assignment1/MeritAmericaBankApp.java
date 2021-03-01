/** This is the main interface of MeritAmericaBank.
 * 
 * Name:  Djeme Doli & Tian Boothe
 * Date: 03/01/2021
 */
package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		 	
		AccountHolder accountNumber = new AccountHolder("Djeme", "D", "Doli","123-456-7890", 100.0, 1000.0);
		String str = accountNumber.toString();
		System.out.println(str);
		AccountHolder accountNumber2 = new AccountHolder();
		String str2 = accountNumber2.toString();
		System.out.println(str2);
		
		
	}
	
}