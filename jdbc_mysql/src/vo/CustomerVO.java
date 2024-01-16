package vo;

public class CustomerVO {
	private int customerNumber;
	private String customerId;
	private String customerPassword;
	private String customerName;
	private int customerAge;
	private String customerPhoneNumber;
	private String customerStatus;

	public CustomerVO() {;}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	
//	private int customerNumber;
//	private String customerId;
//	private String customerPassword;
//	private String customerName;
//	private float customerAge;
//	private String customerPhoneNumber;
//	private String customerStatus;
	@Override
	public String toString() {
		String str = customerNumber
				+ ", " + customerId
				+ ", " + customerPassword
				+ ", " + customerName
				+ ", " + customerAge
				+ ", " + customerPhoneNumber
				+ ", " + customerStatus;
		return str; 
	}
}

