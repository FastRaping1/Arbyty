package arbyty;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Reader {

	public void write(String name, String companyName, String carName, String Colour, String motorType, int hoursePower,
			int carCC, int year, int price) throws IOException {

		File file = new File(name + ".txt");
		ArrayList<String> allData = new ArrayList<String>();
		if (file.isFile()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null)
				allData.add(st);
		}

		FileWriter fileWriter = new FileWriter(name + ".txt");
		for (int i = 0; i < allData.size(); i++)
			fileWriter.write(allData.get(i) + "\n");

		fileWriter.write(companyName + " " + carName + " " + motorType + " " + Colour + " " + hoursePower + " " + carCC
				+ " " + year + " " + price + " ");

		fileWriter.close();
		System.out.println("The car has been saved successfully");

	}

}
