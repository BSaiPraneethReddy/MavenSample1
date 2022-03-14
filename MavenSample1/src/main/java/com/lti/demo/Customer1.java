package com.lti.demo;

public class Customer1 {
	private int custNo;
	private String custName;
	private double billAmount;
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
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public  Customer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", billAmount=" + billAmount + "]";
	}
	

}
