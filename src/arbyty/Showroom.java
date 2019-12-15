package arbyty;

import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {

	Scanner in = new Scanner(System.in);
	private String name;
	private String phoneNumber;
	boolean flag;
	Address address;
	ArrayList<Arbyty> showCars = new ArrayList<Arbyty>();

	public Showroom() {
	}

	public Showroom(String phoneNumber, String name, Address address) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}

	// To add car
	public void addCar(Arbyty c) {
		showCars.add(c);
	}

	// To remove car
	public void removeCar(Arbyty c) {
		for (int i = 0; i < showCars.size(); i++) {
			if ((c.getCompanyName().equals(showCars.get(i).getCompanyName()))
					&& c.getCarName().equals(showCars.get(i).getCarName())) {
				showCars.remove(showCars.get(i));
				return;
			}
		}
		System.out.println("The car doesn't exist ");
	}

	// Getting car details
	public void getshowCars() {
		for (int i = 0; i < showCars.size(); i++) {
			System.out.println(showCars.get(i).getCompanyName() + " : " + showCars.get(i).getCarName() + " "
					+ ", colour : " + showCars.get(i).getColour() + " " + ", CC : " + showCars.get(i).getCarCC() + " "
					+ showCars.get(i).getMotorType() + " " + ", HP : " + showCars.get(i).getHoursePower() + " "
					+ ", Year : " + showCars.get(i).getYear() + " " + ", Price : " + showCars.get(i).getPrice());
		}
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

}
