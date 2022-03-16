package bank;

import java.util.ArrayList;


public class Bank {
private String name;
private ArrayList<Branch> branch;
public Bank(String name) {
	this.name = name;
	this.branch=new ArrayList<>();

}

public String getName() {
	return name;
}

public ArrayList<Branch> getBranch() {
	return branch;
}

public boolean addBranch(String branch) {
	// TODO Auto-generated method stub
	Branch branchObj=findBranch(branch);
	if(branchObj!=null)
	{
		this.branch.add(new Branch(branch));
		return true;
	}
	return false;
}

public boolean addNewCustomer(String branch,String customer,double initialAmount)
{
	Branch objBranch=findBranch(branch);
	if(objBranch!=null)
	{
		return objBranch.newCustomer(customer, initialAmount);
	}
	return false;
}

public boolean addNewTransaction(String branchName,String customer,double newTransaction)
{
	Branch objBranch=findBranch(branchName);
	if(objBranch!=null)
	{
		return objBranch.addNewTransaction(customer, newTransaction);
	}
	return false;
}



public void listBranch()
{
	System.out.println( "Akjit");
	

	for(int i=0;i<this.branch.size();i++)
	{
		
		System.out.println( this.branch.get(i).getName());
		System.out.println( "Akjit");
	}
		
	System.out.println( "Akjit2");
	
}

public void listCustomers(String branchName,boolean transaction)
{
	System.out.println("Called");
	int i=1;
	Branch objBranch=findBranch(branchName);
	System.out.println( objBranch.getName());
	if(objBranch!=null)
	{
		System.out.println("Called2");
		ArrayList<Customers> customers=objBranch.getCustomer();
		for(Customers cust:customers)
		{
		
			System.out.println( i+")\t"+cust.getCustomerName());
			if(transaction==true)
			{
				int j=1;
				ArrayList<Double> custTransactions=cust.getTransaction();
				for(Double trans: custTransactions)
				{
					System.out.println(j+")\t"+trans);
				}
			}
			i++;
		}
	}
	System.out.println("Called3");
}


private Branch findBranch(String branch)
{
	for(Branch branchObj:this.branch)
		
	{
		
		if( branchObj.getName().equals(branch))
		{
			return branchObj;
		}
	}
	return null;
}

}
/*
 public void listCustomers(String branchName,boolean transaction)
{
	System.out.println("Called");
	int i=1;
	Branch objBranch=findBranch(branchName);
	System.out.println( objBranch.getName());
	if(objBranch!=null)
	{
		System.out.println("Called2");
		ArrayList<Customers> customers=objBranch.getCustomer();
		for(Customers cust:customers)
		{
		
			System.out.println( i+")\t"+cust.getCustomerName());
			if(transaction==true)
			{
				int j=1;
				ArrayList<Double> custTransactions=cust.getTransaction();
				for(Double trans: custTransactions)
				{
					System.out.println(j+")\t"+trans);
				}
			}
			i++;
		}
	}
	System.out.println("Called3");
}


private Branch findBranch(String branch)
{
	for(Branch branchObj:this.branch)
		
	{
		
		if( branchObj.getName().equals(branch))
		{
			return branchObj;
		}
	}
	return null;
}
 */
