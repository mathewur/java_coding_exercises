package com.techreturners.exercise001;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Exercise001 {

	private static DecimalFormat df = new DecimalFormat("0.00");
	private static final String LINUX_OS = "Linux";

	public String capitalizeWord(String word) {
		// capitalised first letter and return word
		return Character.toUpperCase(word.charAt(0)) + word.substring(1);
	}

	public String generateInitials(String firstName, String lastName) {
		// return capitalised first letter of first name and second name delimited with
		// full stop
		return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));

	}

	public double addVat(double originalPrice, double vatRate) {
		// original price plus original price times vat percentage formatted to 2dp
		df.setRoundingMode(RoundingMode.DOWN);
		double vatAddedPrice = Double.valueOf(df.format(originalPrice + (originalPrice * (vatRate / 100))));
		// System.out.println("vatAddedPrice"+vatAddedPrice);
		return vatAddedPrice;
	}

	public String reverse(String sentence) {
		// use the StringBuilder class to reverse
		StringBuilder str = new StringBuilder(sentence);
		return str.reverse().toString();
	}

	public int countLinuxUsers(List<User> users) {
		List<User> linuxUsers = new ArrayList<User>();
		// iterate over list of user objects and check if each users type is Linux
		for (User u : users) {
			/*System.out.println("users type : compare to Linux result " + u.getType()
					+ (u.getType().compareToIgnoreCase(LINUX_OS) == 0));*/
			if (u.getType().compareToIgnoreCase(LINUX_OS) == 0) {
				linuxUsers.add(u);
			}
		}
		return linuxUsers.size();

	}
}
