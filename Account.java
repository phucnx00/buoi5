package Bai15;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double  annualInterestRate ;
	private Date dateCreated;
	
	public Account() {
		
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void setId(int id) {
		this.id = id;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate =  annualInterestRate;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setDate(Date date) {
		this.dateCreated = date;
	}
	
	public Date getDate() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}
	
	public double withDraw() {
		return this.balance + this.annualInterestRate / 12 * this.balance;
	}
	
	public void deposit(double x) {
		this.balance = this.balance + x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
