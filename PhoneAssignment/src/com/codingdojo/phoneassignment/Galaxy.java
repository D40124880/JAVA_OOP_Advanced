package com.codingdojo.phoneassignment;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		String temp = this.getRingTone();
		return temp;
	}
	
	@Override
	public String unlock() {
		String temp = "unlocking via finger recognition \n";
		return temp;
	}
	
	@Override
	public void displayInfo() {
		String temp1 = this.getVersionNumber();
		int temp2 = this.getBatteryPercentage();
		String temp3 = this.getCarrier();
		System.out.println("This is an Galaxy " + temp1 + " that has a battery % of " + temp2 + " that is running on the " + temp3 + " network");
	}
}




