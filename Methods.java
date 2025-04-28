package tenkcoders;

class Libraary{
	public static void displayWelcomeMessage() {
		System.out.println("Welecome to the Library Management System!");
	}
}

class Company{
	public static void printCompanyPolicy() {
		System.out.println("Company Policy: All employees must adhere to company policies regarding conduct, \r\n"
				+ "confidentiality, and professionalism.");
	}
}

class App{
	public static void showAppVersion() {
		System.out.println("App Version: 2.5.1");
	}
}

class Store{
	public static void displayStoreHours() {
		System.out.println("Store Hours: 9 AM - 9 PM");
	}
	public static void displayStoreAddress() {
		System.out.println("Store Address: 123 Main Street, NY");
	}
}

class Game{
	
	//if you reverse void static what will happen
	//interview:():"Modifiers come first, return type second.
	//Java expects this order. If reversed, it causes a syntax error."
    //Modifiers define the behavior of the method (like whether it's static, final, synchronized), 
	//so Java needs to understand them first before checking the return type."
	static public void showGameTitle() {
		System.out.println("Welcome to Adventure Quest!");
	}
	static public void showGameRules() {
		System.out.println("1.Collect coins\n2.Avoid Obstacles\n3.Reach the goal");
	}
	static public void showLoadingScreen() {
		System.out.println("Loading game... Please wait");
	}
}

public class Methods {

	public static void main(String[] args) {
		Libraary.displayWelcomeMessage();
		Company.printCompanyPolicy();
		App.showAppVersion();
		Store.displayStoreAddress();
		Store.displayStoreHours();
		Game.showGameTitle();
		Game.showGameRules();
		Game.showLoadingScreen();
	
	}

}
