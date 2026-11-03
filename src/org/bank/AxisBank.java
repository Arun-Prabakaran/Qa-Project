package org.bank;

public class AxisBank extends BankInfo {

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("1000000");
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("96859");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("303232");
		
	}
	public static void main(String[] args) {
		AxisBank ab_1 = new AxisBank();
		ab_1.savings();
		ab_1.fixed();
		ab_1.deposit();
	}

}
