
public class BetaLabWeek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int planeSeatsLeft = 5;
		double costOfGroceries = 23.49;
		char middleInitial = 'A';
		boolean isHotOutside = false;
		String firstName = "Beau";
		String streetAddress = "219 3rd Ave NE";
		
		System.out.println("Available seats left on the plane: " + planeSeatsLeft);
		System.out.println("The cost of the groceries is: " + costOfGroceries);
		System.out.println("My middle initial is: " + middleInitial);
		System.out.println("It is hot outside: " + isHotOutside);
		System.out.println("My first name is: " + firstName);
		System.out.println("I live at this address: " + streetAddress);
		
		
		planeSeatsLeft -= 2;
		System.out.println(planeSeatsLeft);
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		middleInitial = 'S';
		System.out.println(middleInitial);
		isHotOutside = true;
		System.out.println(isHotOutside);
		String fullName = firstName + " " + middleInitial + " Simon";
		System.out.println(fullName);
		System.out.println("This is " + fullName + " and he lives at " + streetAddress);
		
		
	}

}
