package arbyty;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	ArrayList<Arbyty> appCars = new ArrayList<Arbyty>();
	ArrayList<Showroom> appShowRoom = new ArrayList<Showroom>();

	// Checking if the car exist in the showroom
	Showroom isExist(Showroom s) {
		boolean check = false;
		Showroom temp = new Showroom();
		for (int i = 0; i < appShowRoom.size(); i++) {
			if (appShowRoom.get(i).getName().equals(s.getName())) {
				temp = appShowRoom.get(i);
				check = true;
				break;
			}
		}
		if (check == false) {
			temp = s;
			temp.setPhoneNumber("null");
		}
		return temp;
	}

	public void addShowRoom(Showroom showRoom) {
		appShowRoom.add(showRoom);
	}

	// getshowroom() saving all the showroom
	public List<Showroom> getShowRoomCars() {
		return appShowRoom;
	}

	// appcars() Saving all the cars in the app..
	public void appCars() {
		Arbyty car = new Arbyty("BMW", "x6", "black", "auto", 4000, 450, 2020, 1500000);
		appCars.add(car);
		Arbyty car1 = new Arbyty("BMW", "x5", "white", "auto", 3700, 375, 2020, 1300000);
		appCars.add(car1);
		Arbyty car2 = new Arbyty("BMW", "x3", "white", "auto", 3500, 300, 2020, 1100000);
		appCars.add(car2);
		Arbyty car3 = new Arbyty("BMW", "x1", "silver", "auto", 3000, 300, 2020, 1000000);
		appCars.add(car3);
		Arbyty car4 = new Arbyty("BMW", "720", " red ", "auto", 2500, 500, 2020, 1060000);
		appCars.add(car4);
		Arbyty car5 = new Arbyty("BMW", "520", "black", "auto", 2500, 500, 2020, 1040000);
		appCars.add(car5);
		Arbyty car6 = new Arbyty("BMW", "320", "black", "auto", 2500, 450, 2020, 1020000);
		appCars.add(car6);
		Arbyty car7 = new Arbyty("BMW", "316", "grey", "auto", 2500, 300, 2020, 1020000);
		appCars.add(car7);
		Arbyty car8 = new Arbyty("KIA", "Pegas", "Blue", "Auto", 1400, 250, 2020, 240000);
		appCars.add(car8);
		Arbyty car9 = new Arbyty("KIA", "Reo", "Red", "Auto", 1600, 250, 2019, 270000);
		appCars.add(car9);
		Arbyty car10 = new Arbyty("KIA", "Sportage", "Black", "Auto", 1600, 300, 2019, 425000);
		appCars.add(car10);
		Arbyty car11 = new Arbyty("KIA", "Carens", "Brown", "Auto", 1600, 300, 2019, 460000);
		appCars.add(car11);
		Arbyty car12 = new Arbyty("Chevorlet", "Lanos", "White", "Manual", 1500, 130, 2020, 166000);
		appCars.add(car12);
		Arbyty car13 = new Arbyty("Chevorlet", "Aveo", "White", "Auto", 1500, 170, 2020, 200000);
		appCars.add(car13);
		Arbyty car14 = new Arbyty("Chevorlet", "Optra", "Red", "Auto", 1500, 200, 2020, 210000);
		appCars.add(car14);
		Arbyty car15 = new Arbyty("Chevorlet", "Malibu", "Blue", "Auto", 1500, 200, 2019, 390000);
		appCars.add(car15);
		Arbyty car16 = new Arbyty("Hyundai", "Verna", "Silver", "Manual", 1600, 80, 2019, 190000);
		appCars.add(car16);
		Arbyty car17 = new Arbyty("Hyundai", "Accent RB", "Red", "Auto", 1600, 100, 2019, 260000);
		appCars.add(car17);
		Arbyty car18 = new Arbyty("Hyundai", "Creta", "White", "Auto", 1600, 140, 2020, 343000);
		appCars.add(car18);
		Arbyty car19 = new Arbyty("Hyundai", "Sonata", "Dark Blue", "Auto", 1600, 150, 2019, 540000);
		appCars.add(car19);
		Arbyty car20 = new Arbyty("Mercedes", "A 200", "White", "Auto", 1300, 163, 2020, 680000);
		appCars.add(car20);
		Arbyty car21 = new Arbyty("Mercedes", "CLA 180", "Black", "Auto", 1600, 136, 2020, 715000);
		appCars.add(car21);
		Arbyty car22 = new Arbyty("Mercedes", "C 180", "Black", "Auto", 1600, 156, 2020, 830000);
		appCars.add(car22);
		Arbyty car23 = new Arbyty("Mercedes", "E 200", "Silver", "Auto", 2000, 184, 2020, 1280000);
		appCars.add(car23);
		Arbyty car24 = new Arbyty("Opel", "Corsa", "Red", "Auto", 1400, 90, 2019, 280000);
		appCars.add(car24);
		Arbyty car25 = new Arbyty("Opel", "Astra", "White", "Auto", 1400, 140, 2019, 320000);
		appCars.add(car25);
		Arbyty car26 = new Arbyty("Opel", "Grand land", "Blue", "Auto", 1600, 163, 2019, 450000);
		appCars.add(car26);
		Arbyty car27 = new Arbyty("Opel", "Insignia", "Red", "Auto", 1500, 165, 2019, 480000);
		appCars.add(car27);
		Arbyty car28 = new Arbyty("Toyota", "Corolla", "Silver", "Auto", 1600, 120, 2020, 325000);
		appCars.add(car28);
		Arbyty car29 = new Arbyty("Toyota", "Yaris", "White", "Manual", 1000, 68, 2019, 220000);
		appCars.add(car29);
		Arbyty car30 = new Arbyty("Toyota", "Rush", "Black", "Auto", 1500, 103, 2020, 370000);
		appCars.add(car30);
		Arbyty car31 = new Arbyty("Toyota", "Fortuner", "Silver", "Auto", 27000, 163, 2020, 765000);
		appCars.add(car31);
	}

	// Print all cars
	public List<Arbyty> getAppCars() {
		return appCars;
	}

}
