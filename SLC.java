package tenkcoders;



class Students{
	private String name;
	private int rollNumber;
	private double percentage;
	
	public void setDetails(String nm,int roll,double perc) {
		name=nm;
		rollNumber=roll;
	    percentage=perc;
		
	}
	public void getDeatils() {
		System.out.println("Student Name: "+name+"\nRoll Number: "+rollNumber+"\nPercentage: "+percentage);
	}
}

class Product1{
	private String productName;
	private int productId;
	private double price;
	
	public void setProductDeatils(String name,int id,double prc) {
		productName=name;
		productId=id;
		price=prc;
	}
	public void getProductDetails() {
		System.out.println("Product Name: "+productName+"\nProduct ID: "+productId+"\nProduct Price: "+price);
	}
}

class Bok{
	private String title;
	private String author;
	private double price;
	public void setBookDeatils(String t,String a,double p) {
		title=t;
		author=a;
		price=p;
	}
	public void getBookDeatils() {
		System.out.println("Book Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
	}
}

class Ccar{
	private String model;
	private String company;
	private double price;
	public void setCarDetails(String m,String c,double p) {
		model=m;
		company=c;
		price=p;
	}
	public void getCarDetails() {
		
		System.out.println("Car Model: "+model+"\nCompany: "+company+"\nCar Price: "+price);
	}
}

class BankAccount{
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	public void setAccountDetails(String holder,int accNum,double bal) {
		accountHolder=holder;
		accountNumber=accNum;
	    balance=bal;
	}
	
	public void getAccountDeatils() {
		System.out.println("Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nBalance: "+balance);
	}
}
public class SLC {

	public static void main(String[] args) {
		System.out.println("---------Problem 1----------");
	    Students s=new Students();
	    s.setDetails("ABC", 101, 85.5);
	    s.getDeatils();
	    System.out.println("---------Problem 2----------");
	    Product1 p = new Product1();
	    p.setProductDeatils("Laptop", 501, 75000);
	    p.getProductDetails();
	    System.out.println("---------Problem 3----------");
	    Bok b = new Bok();
	    b.setBookDeatils("Java Basics", "John Doe", 450);
	    b.getBookDeatils();
	    System.out.println("---------Problem 4----------");
	    Ccar c = new Ccar();
	    c.setCarDetails("Swift", "Maurti", 60000);
	    c.getCarDetails();
	    System.out.println("---------Problem 5----------");
	    BankAccount bank = new BankAccount();
         bank.setAccountDetails("Rahul", 12345, 4000000);
         bank.getAccountDeatils();
         
	}

}
