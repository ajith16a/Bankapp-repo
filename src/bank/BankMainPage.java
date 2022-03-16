package bank;
public class BankMainPage 
{
	/*private static Scanner sc=new Scanner(System.in);
	private static ArrayList<Branch> branch=new ArrayList<>();
	private static Bank bank=new Bank("SBI");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean option=true;
		int action;
		menu();
		while(option!=false)
		{
			System.out.println("choose our action");
			action=sc.nextInt();
			sc.nextLine();
			switch(action)
			{
			case 1:
				branch();
				break;
			case 2:
				customer();
				break;
			case 3:
				transactions();
			case 4:
				menu();
			}
		}
		

	}
	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("/tMenu"
				+"/t1) Branch name"
				+"/t2) Customer"
				+"/t3)transction"
				+"/t4)Menu");
		
		
	}
	private static void transactions() {
		// TODO Auto-generated method stub
		
		
	}
	private static void customer() {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println("Choose a branch");
		ArrayList<Branch> branch=bank.getBranch();
		for(Branch name:branch)
		{
			
			System.out.println(i+") "+name.getName());
			i++;
		}
		int b=sc.nextInt();
		sc.nextLine();
		Branch obj=branch.get(b);
		String branchName=obj.getName();
		
		
		
		
	}
	private static void branch() {
		// TODO Auto-generated method stub
		System.out.println("New Branch Name");
		String branchName=sc.nextLine();
		bank.addBranch(branchName);

	}
	*/
	public static void main(String[] args) 
	{
		Bank bank=new Bank("SBI");
		bank.addBranch("Wanaparthy");
		bank.addNewCustomer("Wanaparthy", "Ajith", 123.50);
		bank.addBranch("kothakota");
		bank.addNewCustomer("kothakota", "pandu", 1969.0);
	System.out.println(	bank.getBranch().get(1).getName());
		//bank.listCustomers("kothakota", false);
		
	}
}
