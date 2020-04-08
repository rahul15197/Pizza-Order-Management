public class Customer {
	
	private int custNo;
	private String custName;
	private String custAddr;
	public static int billNo;
	
	
	static {
		billNo = 15210;
	}
	
	static int printBillNo() {
		return billNo++;
	}
	
	public Customer() {
		super();
	}
	public Customer(int custNo, String custName, String custAddr) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custAddr = custAddr;
	}

	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	

}
