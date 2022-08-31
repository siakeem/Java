package ch08;
//p234 + p238

public class Custmoer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Custmoer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcprice(int price) {
		bonusPoint += price * bonusPoint;
		return  price; 
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" +
				bonusPoint+ "입니다.";
	}
	
	public int gerCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
