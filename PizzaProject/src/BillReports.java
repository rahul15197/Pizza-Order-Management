
public class BillReports {
	
	Bill bills[]=new Bill[10];
	
	public static void main(String args[]) {
	}
	
	public void addBill(Bill bill)
	{
		for(int i=0;i<10;i++) {
			
			bills[i]=new Bill(bill.getBillNo(),bill.getTotal(),bill.getCustName(),bill.getItems(),bill.getDate());
		}
	}
	
	public boolean updateBill(int billNo, int newTotal) {
		if(billNo > 0) {
			return true;
		}
		else
			return false;
	}

	public Bill[] getBills() {
		return bills;
	}

	public void setBills(Bill[] bills) {
		this.bills = bills;
	}
	
	Bill searchBill(int billNo) {
		for(int i=0;i<10;i++) {
		if(billNo == bills[i].getBillNo()) {
			return Bill
		}
		}
	}
	
	
}

