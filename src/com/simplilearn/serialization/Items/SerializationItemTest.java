package com.simplilearn.serialization.Items;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationItemTest {

	public static void main(String[] args) {
		Items item = new Items(1, "chocolate");
		String filename = "list.txt";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(item);
			out.close();
			file.close();

		} catch (IOException e) {
			System.out.println("IOException is caught");
		}

	}

}
