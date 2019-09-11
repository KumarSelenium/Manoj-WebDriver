package javabasicstests2;

class Switchstatementtest2 {

	public static void main(String[] args) {
		String weekDay="Tuesday";
		switch (weekDay) {
		case "Monday":
			System.out.println("1");
			break;
		case "Tuesday":
			System.out.println("2");
			break;

		default:
			System.out.println("Holiday");
			break;
		}

	}

}
