public class CustomerReport {
	
	int i=0;
	
	Customer[] custArray = new Customer[10];
	
	public void addCustomer(Customer cust) {
		custArray[i] = new Customer(cust.getCustNo(),cust.getCustName(),cust.getCustAddr());
		i++;
	}

	
	public void printList() {
		for(int a=0;a<i;a++)
		{
			System.out.println("Bill no. : " + Customer.printBillNo() + "\tDate : " + java.time.LocalDate.now());;
			System.out.println("Customer : "+custArray[a].getCustName());
			System.out.println("Address : "+custArray[a].getCustAddr());
		}
	}

}
