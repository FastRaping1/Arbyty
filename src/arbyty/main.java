package arbyty;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import arbyty.Showroom;
import arbyty.Arbyty;
import arbyty.Address;
import arbyty.Customer;
import arbyty.Repository;

public class main {

	public static void main(String[] args) throws IOException {

		File_Reader file = new File_Reader();
		Scanner in = new Scanner(System.in);
		int Menu = 0;
		int cc;
		Repository r = new Repository();
		r.appCars();

		while (Menu == 0) {

			System.out.println("\t\t\t  MainMenu ");
			System.out.println("\t\t----------------------------");
			System.out.println("\t\t 1.Customer.\n\t\t 2.Showroom.\n\t\t 3.exit.\n");
			Customer customer = new Customer();
			Showroom showRoom = new Showroom();
			System.out.println("\t\t Please Enter a choice... ");
			cc = in.nextInt();

			if (cc == 1) {
				customer.Customer_info(customer);
				System.out.println("Hello " + customer.getName());

			} else if (cc == 2) {
				System.out.println("Enter showroom name please... ");
				String name = in.next();
				showRoom.setName(name);
				showRoom = r.isExist(showRoom);
				Address d = new Address();
				System.out.println("Enter the building number... ");
				d.setBuildingNumber(in.next());
				System.out.println("Enter the street name... ");
				d.setStreetName(in.next());
				showRoom.setAddress(d);
				System.out.println("enter the City name... ");
				d.setCity(in.next());

			}

			switch (cc) {
			case 1: {
				while (true) {
					System.out.println("\t\t\tMenu ");
					System.out.println("\t\t------------------------");
					System.out.println("\t\t 1.View All Cars\n\t\t 2.View Cars in a Certain Showroom");
					int choice = in.nextInt();
					if (choice == 1) {
						customer.viewAppCars(r);
					} else if (choice == 2) {

						System.out.println("Enter the show room name : ");
						showRoom.setName(in.next());
						File file1 = new File(showRoom.getName() + ".txt");
						ArrayList<String> allData = new ArrayList<String>();
						String st2 = new String();
						allData.clear();

						if (file1.isFile()) {

							BufferedReader br = new BufferedReader(new FileReader(file1));
							String st;
							while ((st = br.readLine()) != null) {
								allData.add(st);
								st2 += st;
							}
						}

						if (showRoom.getPhoneNumber() == "null") {
							for (int j = 0, i = 0; i < allData.size(); i++) {
								Arbyty car = new Arbyty();
								String str[] = allData.get(i).split(" ");
								car.setCompanyName(str[j]);
								car.setCarName(str[j + 1]);
								car.setMotorType(str[j + 2]);
								car.setColour(str[j + 3]);
								car.setHoursePower(Integer.parseInt(str[j + 4]));
								car.setCarCC(Integer.parseInt(str[j + 5]));
								car.setYear(Integer.parseInt(str[j + 6]));
								car.setPrice(Integer.parseInt(str[j + 7]));
								showRoom.addCar(car);
								showRoom.setPhoneNumber("1");

							}
							allData.clear();
							if (!(r.getShowRoomCars().contains(showRoom)))
								r.addShowRoom(showRoom);
						}

						showRoom = r.isExist(showRoom);

						customer.viewShowRoomCars(showRoom.getName(), r);
						while (true) {
							System.out.println("Do you want to reserve a car ? (yes or no)");
							String answer = in.next();
							if (answer.equals("yes")) {
								Systemm payment = new Systemm();
								System.out.println("Enter the company name : ");
								Arbyty c = new Arbyty();
								c.setCompanyName(in.next());

								System.out.println("Enter the car name : ");
								c.setCarName(in.next());

								customer.reservedCar = c;
								payment.Paymenter_info();
								showRoom.removeCar(c);
								break;
							} else if (!answer.equals("no")) {
								System.out.println("Enter valid answer\n");
							} else {
								break;
							}
						}
					} else {
						System.out.println("Enter valid characters");
					}
					System.out.println("press any number except 1 --> to go to previos menu");
					System.out.println("\npress 1 then 0 --> to go to main menu");
					int ans = in.nextInt();
					if (ans == 1)
						break;
				}
				break;
			}

			case 2: {

				while (true) {

					System.out.println("\t\t\tMenu  ");
					System.out.println("\t\t------------------------");
					System.out.println("\t\t 1.Add Car\n\t\t 2.Remove Car");
					int choice = in.nextInt();
					Arbyty c = new Arbyty();
					if (choice == 1) {
						System.out.println("Please enter the Company Name : ");
						while (!in.hasNext("[A-Za-z]+")) {
							c.setCompanyName(in.next());
							System.out.println("Please Enter a Right Company Name !!!");
						}
						c.setCompanyName(in.next());
						String companyName = c.getCompanyName();
						System.out.println("Enter the car model : ");
						c.setCarName(in.next());
						String carName = c.getCarName();
						System.out.println("Enter the car color : ");
						c.setColour(in.next());
						String colour = c.getColour();
						while (true) {
							System.out.println("Enter the car cc : (min-->1000 , max-->10000)");
							if (c.setCarCC(in.nextInt()))
								break;
						}
						int carCC = c.getCarCC();
						System.out.println("Enter the engine type : ");
						c.setMotorType(in.next());
						String motorType = c.getMotorType();
						while (true) {
							System.out.println("Enter the hourse Power : ");
							if (c.setHoursePower(in.nextInt()))
								break;
						}
						int hoursePower = c.getHoursePower();
						System.out.println("Enter the model year : ");
						c.setYear(in.nextInt());
						int year = c.getYear();
						System.out.println("Enter the  price : ");
						c.setPrice(in.nextInt());
						int price = c.getPrice();
						showRoom.addCar(c);
						file.write(showRoom.getName(), companyName, carName, colour, motorType, hoursePower, carCC,
								year, price);

						System.out.println("");
					} else if (choice == 2) {
						Arbyty temp = new Arbyty();
						System.out.println("Enter the company name : ");
						temp.setCompanyName(in.next());

						System.out.println("Enter car name : ");
						temp.setCarName(in.next());

						showRoom.removeCar(temp);
					} else {
						System.out.println("Enter valid number/n");
					}
					System.out.println("Press any number except 1 --> to go to previos menu");
					System.out.println("\npress 1 then 0 --> to go to main menu");

					int ans = in.nextInt();
					if (ans == 1) {
						if (!(r.getShowRoomCars().contains(showRoom)))
							r.addShowRoom(showRoom);
						break;
					}
				}
				break;
			}
			case 3: {
				System.out.println("Good Bye :)");
				return;
			}
			default:
				System.out.println("Enter valid number 1 or 2");
				continue;
			}

			Menu = in.nextInt();

		}
	}

}
