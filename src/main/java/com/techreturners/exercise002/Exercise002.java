package com.techreturners.exercise002;

public class Exercise002 {

	public boolean isFromManchester(Person person) {
		// check if the person's city is Manchester
		return person.getCity().equalsIgnoreCase(Person.getManchesterCity());
	}

	public boolean canWatchFilm(Person person, int ageLimit) {
		// check if the person's age is over limit
		//System.out.println("person.getAge() : compare with limit "+person.getAge()+(person.getAge() >= ageLimit));

		return (person.getAge() >= ageLimit);
	}

}
