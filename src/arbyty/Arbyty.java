package arbyty;

import java.util.Scanner;

public class Arbyty {

	private String companyName; // BMW
	private String carName; // x6
	private String colour; // red
	private String motorType; // automatic
	private int carCC;// 1600cc
	private int hoursePower;// 250hp
	private int year; // 2011
	private int price; // 450000

	public Arbyty() {
		// default constructor
	}

	// constructor using signatures
	public Arbyty(String companyName, String carName, String colour, String motorType, int carCC, int hoursePower,
			int year, int price) {

		this.companyName = companyName;
		this.carName = carName;
		this.colour = colour;
		this.motorType = motorType;
		this.carCC = carCC;
		this.hoursePower = hoursePower;
		this.year = year;
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	public int getCarCC() {
		return carCC;
	}

	// checking car CC
	public boolean setCarCC(int carCC) {
		boolean flag = false;
		if (carCC >= 1000 && carCC <= 10000) {
			this.carCC = carCC;
			flag = true;
		} else {
			System.out.println("Enter a higher car CC\n");
			flag = false;
		}
		return flag;

	}

	public int getHoursePower() {
		return hoursePower;
	}

	// Checking Hourse Power
	public boolean setHoursePower(int hoursePower) {
		boolean flag = false;

		if (hoursePower > 80) {
			this.hoursePower = hoursePower;
			flag = true;
		} else {
			System.out.println("Please enter a right hourse power\n");
			flag = false;
		}

		return flag;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
