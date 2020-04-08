
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reception {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int orderNo = 1;
		String strDate;
		Date orderDate=null;
		int cost;
		String custName;
		String custAddress;
		int approxDistance;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Please Enter Details : ");
		System.out.println("Order Date (DD/MM/YYYY) : ");
		strDate = scanner.next();
		try {
			orderDate = simpleDateFormat.parse(strDate);
			} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Cost : ");
		cost = scanner.nextInt();
		System.out.println("Customer Name : ");
		custName = scanner.next();
		System.out.println("Enter Customer's Address : ");
		custAddress = scanner.next();
		System.out.println("Enter Approx. Distance in KMs : ");
		approxDistance = scanner.nextInt();
		Order order = new Order(orderDate, cost, custName, custAddress, approxDistance);
		if(order.delivery() == true) {
			System.out.println("Yay! Delivery will be free of cost! :D");
			System.out.println("Date : " + orderDate);
		}
		else
			System.out.println("Home Delivery not available for this distance. Sorry :(");
	}

}
