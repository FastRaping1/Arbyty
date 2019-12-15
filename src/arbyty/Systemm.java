package arbyty;

import java.util.Scanner;

public class Systemm {
	Scanner in = new Scanner(System.in);
	private String Payment_type;
	private String Paymenter_name;
	private String Credit_Card_number;

	public Systemm(String payment_type, String paymenter_name, int Credit_Card_number) {
		Payment_type = payment_type;
		Paymenter_name = paymenter_name;
		Credit_Card_number = Credit_Card_number;
	}

	public Systemm() {

	}

	public String getPayment_type() {
		return Payment_type;
	}

	public void setPayment_type(String payment_type) {

		Payment_type = payment_type;
	}

	public String getPaymenter_name() {

		return Paymenter_name;
	}

	public void setPaymenter_name(String paymenter_name) {
		Paymenter_name = paymenter_name;
	}

	public String getCredit_Card_number() {
		return Credit_Card_number;
	}

	public void setCredit_Card_number(String Credit_Card_number) {
		Credit_Card_number = Credit_Card_number;
		String regex = "\\d+";
		boolean matches;
		matches = Credit_Card_number.matches(regex);
		if (matches == false) {
			while (matches != true) {
				System.out.println("Please Enter Ur Right CreditCard Number");
				Credit_Card_number = in.next();
				matches = Credit_Card_number.matches(regex);
			}
		}

	}

	public void Paymenter_info() {

		System.out.println("Enter your Payment type : ");
		// If the user enter a non string payment type
		while (!in.hasNext("[A-Za-z]+")) {
			setPayment_type(in.next());
			System.out.println("Please Enter your Right Payment type : ");
		}
		setPayment_type(in.next());

		System.out.println("Enter your Paymenter name : ");
		// If the user enter a non string name
		while (!in.hasNext("[A-Za-z]+")) {
			setPayment_type(in.next());
			System.out.println("Please Enter your Right Paymenter name : ");
		}
		setPayment_type(in.next());
		System.out.println("Please Enter your Payment_number");
		// If the user enter a non integer number
		setCredit_Card_number(in.next());
	}

}
