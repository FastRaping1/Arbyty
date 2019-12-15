package arbyty;

import java.util.Scanner;

public class Address {

	private String buildingNumber;
	private String streetName;
	private String city;

	Scanner in = new Scanner(System.in);

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
		String regex = "\\d+";
		boolean matches;
		matches = buildingNumber.matches(regex);
		if (matches == false) {
			while (matches != true) {
				System.out.println("Please Enter your Right BuildNumber in Digits");
				buildingNumber = in.next();
				matches = buildingNumber.matches(regex);
			}
		}
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		String regex = "[A-Za-z]+";
		boolean matches;
		matches = city.matches(regex);
		if (matches == false) {
			while (matches != true) {
				System.out.println("Please Enter your Right City Name in Alphabet");
				city = in.next();
				matches = city.matches(regex);
			}
		}

	}

}
