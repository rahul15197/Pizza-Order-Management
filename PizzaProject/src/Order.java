import java.util.Date;

public class Order implements Deliverable{
	int orderNo;
	Date orderDate;
	int cost;
	String custName;
	String custAddress;
	int approxDistance;
	
	public Order() {
		super();
	}

	public Order(Date orderDate, int cost, String custName, String custAddress, int approxDistance) {
		super();
		this.orderDate = orderDate;
		this.cost = cost;
		this.custName = custName;
		this.custAddress = custAddress;
		this.approxDistance = approxDistance;
	}

	public boolean delivery() {
		if(approxDistance <= deliveryAreaLimit)
			return true;
		else
			return false;
	}
	
	

}
