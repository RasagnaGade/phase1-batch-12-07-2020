package com.simplilearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeEmailDemo {

	public static void main(String[] args) 
	{
        String[] users = new String[] { "abc@gmail.com","xyz@gmail.com","andy@gmail.com","smith@gmail.com","Sam@gmail.com"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Old mail id :");
		String oldName  = input.nextLine();
		System.out.println("Enter a New mail id :");
		String  newName = input.nextLine();
		input.close();
		int count = 0;
		for (int i = 0; i < users.length; i++) {
			if(users[i].equals(oldName)) {
					users[i] = newName;
					count++;
			} 
		}
		if(count == 0) {
			System.out.println("User mail is not available");
		} else {
			System.out.println("User mail id is changed");
			System.out.println(Arrays.toString(users));
		}

	}

}