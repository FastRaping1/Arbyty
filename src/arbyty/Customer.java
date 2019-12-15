package arbyty;

import java.util.Scanner;

public class Customer {
	private String email;
	String id;
	private String name;
	private String phoneNumber;
	public Arbyty reservedCar;

	public Customer() {
		name = "";
	}

	public Customer(String email, String id, String name) {
		this.email = email;
		this.id = id;
		this.name = name;

	}

	// To view all cars as details for user
	public void viewAppCars(Repository r) {
		for (int i = 0; i < r.getAppCars().size(); i++)
			System.out.println(r.getAppCars().get(i).getCompanyName() + " : " + r.getAppCars().get(i).getCarName() + " "
					+ ", colour : " + r.getAppCars().get(i).getColour() + " " + ", CC : "
					+ r.getAppCars().get(i).getCarCC() + " " + r.getAppCars().get(i).getMotorType() + " " + ", HP : "
					+ r.getAppCars().get(i).getHoursePower() + " " + ", Year : " + r.getAppCars().get(i).getYear() + " "
					+ ", Price : " + r.getAppCars().get(i).getPrice());

	}

	// To get show rooms cars
	public void viewShowRoomCars(String name, Repository r) {
		for (int i = 0; i < r.getShowRoomCars().size(); i++) {
			if (r.getShowRoomCars().get(i).getName().equals(name)) {
				r.getShowRoomCars().get(i).getshowCars();
			}

		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// To get custmer information
	public void Customer_info(Customer c) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		// The user must enter his name as a string
		while (!in.hasNext("[A-Za-z]+")) {
			c.setName(in.next());
			System.out.println("Please enter your Right Name\n");
		}
		c.setName(in.next());
		System.out.println("Enter your id : ");
		// The user must enter his ID as a inter
		c.setId(in.next());
		String regex = "\\d+";
		boolean matches = c.getId().matches(regex);
		if (matches == false) {
			while (matches != true) {
				System.out.println("Please Enter your ID In Numbers\n");
				c.setId(in.next());
				matches = c.getId().matches(regex);
			}
		}
		System.out.println("Enter your phone number : ");
		// The user must enter his Phone Number as a inter
		c.setPhoneNumber(in.next());
		matches = c.getPhoneNumber().matches(regex);
		if (matches == false) {
			while (matches != true) {
				System.out.println("Please Enter your PhoneNumber in Numbers\n");
				c.setPhoneNumber(in.next());
				matches = c.getPhoneNumber().matches(regex);
			}
		}
		System.out.println("Enter your email : ");
		// The user must enter his Email with @
		c.setEmail(in.next());
		String Regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		matches = c.getEmail().matches(Regex);
		if (matches == false) {
			while (matches != true) {
				System.out.println("Please Enter your Right Email");
				c.setEmail(in.next());
				matches = c.getEmail().matches(Regex);
			}
		}
	}

}