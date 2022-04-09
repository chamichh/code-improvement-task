package practicals;

import java.util.ArrayList;

public class CodeImprovementTwo {

	public static void main(String[] args) {
		ArrayList<String> things = new ArrayList<String>();
		things.add("party");
		things.add("study");
		things.add("food");
		checkForThings(things, "party");
		checkForThings(things, "study");
		checkForThings(things, "coffee");
		checkForThings(things, "drugs");

		System.out.println(isGuyCool("Bobby", 65));
		System.out.println(isGuyCool("Magic", 15));
		System.out.println(isGuyCool("Mike", 14));

		callPerson("Bob", "hubb");
		callPerson("Anna", "wife");
	}

	static void callPerson(String name, String type) {
		System.out.println("Hello, " + name + ". Will you be my " + type + "?");
	}

	

	static void checkForThings(ArrayList<String> values, String type) {
		if (values == null || values.size() == 0 || !values.contains(type)) {
			System.out.println("No " + type + " here");
		} else {
			System.out.println("We have " + type);
		}
	}

	static boolean isGuyCool(String name, int age) {
		return isAdult(name, age);
	}

	static boolean isAdult(String name, int age) {
		return (name.contains("Magic") || name.contains("Doggo") || name.contains("Chuck Norris") || age > 18);
	}

}
