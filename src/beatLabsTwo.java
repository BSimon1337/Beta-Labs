

public class beatLabsTwo {

	public static void main(String[] args) {
		//create a variable named age and assign it a value
		int age = 14;
		
		//print the boolean expression below
		System.out.println(age >= 16);
		//change the value of the variable
		age = 15;
		
		//create a condition. You created this conditional below with two possibilities
		
		boolean hasLicense = true; //add a new variable called has license. This is a boolean
		
		if(age >= 16 && hasLicense) { // change the boolean to need hasLicense and age. both must be true to work
			System.out.println("You can drive");
		}
		else {
			System.out.println("You cannot drive");
		}
		
		double costOfMilk = 3.25;
		int thirstLevel = 7; 
		
		if(costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk please");
		}
		else {
			System.out.println("No thanks");
		}
		
		int numberOfCookies = 13;
		int numberOfChildren = 7;
		
		//int remainingCookies = numberOfCookies % numberOfChildren;
		
		if (numberOfCookies % numberOfChildren >= 5) {//you can save resources by creating an int that will calculate the expression
			System.out.println("Jack pot!");
		}
		else if (numberOfCookies % numberOfChildren >= 2){
			System.out.println("Woohoo");
		}
		else if (numberOfCookies % numberOfChildren >= 1) {
			System.out.println("Yes");
		}
		
		else {
			System.out.println("Sad Face");
		}
		
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = .1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
			
		}
		
		double billTotal = 640.50;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) 
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			}else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		System.out.println(loyaltyMemberStatus);
		
		String username = "Tommy12";
		String password = "1234";
		
		if (username.equals("Tommy123") && password.equals("12345")){ //use .equals for strings
			System.out.println("Login successful");
		}
		else {
			System.out.println("Access denied");
		}

	}

}
