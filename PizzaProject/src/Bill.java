import java.sql.Date;

public class Bill {
	int billNo,total;
	String custName,items;
	Date date;
		
	public Bill() {
		super();
	}
	public Bill(int billNo, int total, String custName, String items, Date date) {
		super();
		this.billNo = billNo;
		this.total = total;
		this.custName = custName;
		this.items = items;
		this.date = date;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
