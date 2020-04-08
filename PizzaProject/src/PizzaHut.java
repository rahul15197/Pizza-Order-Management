import java.util.Scanner;
public class PizzaHut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cno,n,i,choice,costOfPizza;
		String cname,caddr,more;
		String type,name,toppings;
		float timeForPreparation;
		Customer[] customers = new Customer[10];
		CustomerReport customerReport = new CustomerReport();
		System.out.println("Enter Number of Customers to add : ");
		n = scanner.nextInt();
		System.out.println("Enter details of "+n+" customers : ");
		for(i=0;i<n;i++) {
			System.out.println("Customer No. : ");
			cno = scanner.nextInt();
			System.out.println("Name : ");
			cname = scanner.next();
			System.out.println("Address : ");
			caddr = scanner.next();
			customers[i] = new Customer(cno,cname,caddr);
			customerReport.addCustomer(customers[i]);
		}
		customerReport.printList();
}
}
