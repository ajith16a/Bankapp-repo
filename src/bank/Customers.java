package bank;

import java.util.ArrayList;


public class Customers {
	private ArrayList<Double>transaction;
	private String customerName;
	
	
	public Customers(double newTransaction, String customerName) {
		this.transaction = new ArrayList<>();
		this.customerName = customerName;
		addTransaction(newTransaction);
	}




	public ArrayList<Double> getTransaction() {
		return transaction;
	}




	public String getCustomerName() {
		return customerName;
	}

	public void addTransaction(double newTransaction)
	{
		
		transaction.add(newTransaction);		
	}




	public String getName() {
		// TODO Auto-generated method stub
		return customerName;
	}
	
	

}
