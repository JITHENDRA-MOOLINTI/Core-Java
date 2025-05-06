package tenkcoders;


class Carr{
	static String companyName="Honda";
	String carModel="Civic";
	
}

class Product{
	static String category="Electronics";
	String productName;
}

class Departement{
	static  String deptName="HR";
	String empName;
}

class Library1{
	static String libraryName;
	String bookTitle;
}

class Player{
	static int totalPlayers=0;
	String playerName;
}

class Config{
	static String configName="System Config";
	String settingValue;
}

class Computer1{
	static String os="Windows";
	String ram;
}
public class StaticAndNonStaticVariables {

	public static void main(String[] args) {
		
		System.out.println("Company: "+Carr.companyName);
	     Carr c1 = new Carr();
	     Carr c2 = new Carr();
	     c1.carModel="Civic";
	     c2.carModel="Accord";
		System.out.println("Car 1 Model: "+c1.carModel+"\nCar 2 Model: "+c2.carModel);
		System.out.println("--------Product----------");
		System.out.println("Category: "+Product.category);
		Product p1 = new Product();
		Product p2 = new Product();
		p1.productName="Laptop";
		p2.productName="SmartPhone";
		System.out.println("Product 1: "+p1.productName+"\nProduct 2: "+p2.productName);
		System.out.println("--------Departement----------");
		Departement d1 = new Departement();
		Departement d2 = new Departement();
		d1.empName="John";
		d2.empName="Alice";
		System.out.println("before modification");
		System.out.println("Departement: "+Departement.deptName+"\nEmployee 1: "+d1.empName+"\nEmployee 2: "+d2.empName);
		Departement.deptName="Marketing";
		System.out.println("after modfication");
		System.out.println("Departement: "+Departement.deptName+"\nEmployee 1: "+d1.empName+"\nEmployee 2: "+d2.empName);	
		System.out.println("--------Library----------");
		Library1.libraryName="Central Library";
		System.out.println("Library Name: "+Library1.libraryName);
		//Cannot make a static reference to the non-static field Library.bookTitle
		//Library.bookTitle="Java programming";
		// Learn that static variables can be accessed using the class name, but non-static
		 //variables require an object instance
		
		System.out.println("--------Player----------");		
		Player pl1 = new Player();
		pl1.playerName="Jithu";
		Player.totalPlayers++;
		Player pl2 = new Player();
		Player.totalPlayers++;
		pl2.playerName="Nandha";
		System.out.println("Total Player: "+Player.totalPlayers);
		
		System.out.println("--------Config----------");		
		Config co1 = new Config();
		Config.configName="System Config";
		co1.settingValue="Dark Mode";
		System.out.println("Config Name: "+Config.configName+"\nSetting 1: "+co1.settingValue);
		Config co2 = new Config();
		Config.configName="System Apple Config";
		co2.settingValue="Light Mode";
		System.out.println("Config Name: "+Config.configName+"\nSetting 1: "+co2.settingValue);
		
		System.out.println("--------Computer----------");	
		System.out.println("OS: "+Computer1.os);
		Computer1 cm1 = new Computer1();
		cm1.ram="8GB";
		System.out.println("Computer 1 RAM: "+cm1.ram);
		
		Computer1 cm2 = new Computer1();
		cm2.ram="16GB";
		System.out.println("Computer 2 RAM: "+cm2.ram);
		
	}

}
