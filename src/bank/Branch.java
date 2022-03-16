package bank;

import java.util.ArrayList;


public class Branch {
private String name;
private ArrayList <Customers> customer;
public Branch(String name) {
	this.name = name;
	this.customer=new ArrayList<>();
}

public boolean newCustomer(String name,double transaction)
{
	if(check(name)==null)
	{
		this.customer.add(new Customers(transaction,name));
		return true;
	}
	return false;

}
public boolean addNewTransaction(String name,double amount)
{
	Customers a=check(name);
	if(a!=null)
	{
		a.addTransaction(amount);
		return true;
	}
	return false;
}

public String getName() {
	return name;
}

public ArrayList<Customers> getCustomer() {
	return customer;
}



public void setCustomer(ArrayList<Customers> customer) {
	this.customer = customer;
}

private Customers check(String name)
{
	for(Customers existingName:customer)
	{
		if(existingName.getCustomerName().equals(name));
		return existingName;
	}
	return null;
}

}
