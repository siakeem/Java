package ch08;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcprice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price *saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	

}
