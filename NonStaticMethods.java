package tenkcoders;


class Caar{
	public void displayDetails(String showroomName,String modelName,int price) {
		System.out.println("Showroom Name: "+showroomName+"\nCar Model: "+modelName+"\nCar Price: "+price);
		System.out.println("----------------------------------------");
	}
}


class  Booook{
	public void displayInfo(String libraryName,String title,String author) {
		System.out.println("Library Name: "+libraryName+"\nBook Title: "+title+"\nBook Author: "+author);
		System.out.println("----------------------------------------");
	}
}

class Mobile{
	public void showDetails(String storeName,String brand,int price) {
		System.out.println("Store Name: "+storeName+"\nMobile Brand: "+brand+"\nMobile Price: "+price);
		System.out.println("----------------------------------------");
	}
}

class Patient{
	public void printDetails(String hospitalName,String patientName,int age) {
		System.out.println("Hospital Name: "+hospitalName+"\nPatient Name: "+patientName+"\nPatient Age: "+age);
		System.out.println("----------------------------------------");
	}
}
class Faculty{
	public void showFacultyDetails(String universityName,String facultyName,String departement) {
		System.out.println("University Name: "+universityName+"\nPatient Name: "+facultyName+"\nPatient Age: "+departement);
		System.out.println("----------------------------------------");
	}
}
class Order{
	public String getOrderDetails(String restaurantName,String foodItem,int quantity) {
		return "Restaurant Name: "+restaurantName+"\nFood Item: "+foodItem+"\nQuantity: "+quantity;
	}
}
class Ticket{
	public String getTicketInfo(String theaterName,String movieName,String seatNo) {
		return "Theatre Name: "+theaterName+"\nMovie Name: "+movieName+"\nSeat No: "+seatNo;
	}
}
class Enrollement{
	public String getEnrollementInfo(String platform,String course,String Student) {
		return "Platform: "+platform+"\nCourse: "+course+"\nStudent: "+Student;
	}
}
class Travel{
	public String getBookingDetails(String agency,String destination,int travellers) {
		return "Agency: "+agency+"\nDestination: "+destination+"\nTravellers: "+travellers;
	}
}
class Reservation{
	public String getReservationDetails(String hotelName,String guestName,int nights) {
		return "Hotel Name: "+hotelName+"\nGuest Name: "+guestName+"\nNights: "+nights;
	}
}
public class NonStaticMethods {

	public static void main(String[] args) {
		Caar c = new Caar();
		c.displayDetails("Elite Motors", "Tesla Model S", 80000);
		c.displayDetails("Elite Motors", "BMW X5", 75000);
		Booook b = new Booook();
		b.displayInfo("City Public Library","The Great Gatsby","F.Scott Fitzgerld");
		b.displayInfo("City Public Library","1984","George Orwell");
		Mobile m = new Mobile();
		m.showDetails("Tech World","Apple",1200);
		m.showDetails("Tech World","Samsung",900);
		Patient p = new Patient();
		p.printDetails("City Care Hospital", "John Doe", 45);
		p.printDetails("City Care Hospital", "Emma Watson", 30);
		Faculty f = new Faculty();
        f.showFacultyDetails("Standford University", "Dr. Robert Brown", "Computer Science");		
        f.showFacultyDetails("Standford University", "Dr. Lisa Green", "Physcis");
      
        Order o = new Order();

        System.out.println(o.getOrderDetails("Spice Garden", "Paneer Butter Masala", 2));	
        System.out.println("------------------------------------------------------------");
        System.out.println(o.getOrderDetails("Spice Garden", "Chicken Biryani", 1));
        System.out.println("-----------------------------------------------");
        Ticket t = new Ticket();
        System.out.println(t.getTicketInfo("Galaxy Cinemas", "Interstellar", "A10"));	
        System.out.println("------------------------------------------------------------");
        System.out.println(t.getTicketInfo("Galaxy Cinemas", "Inception", "B12"));
        System.out.println("-----------------------------------------------");
        Enrollement e = new Enrollement();
        System.out.println(e.getEnrollementInfo("Udemy", "Java Programming", "Alice"));	
        System.out.println("------------------------------------------------------------");
        System.out.println(e.getEnrollementInfo("Udemy", "Web Development", "Bob"));
        System.out.println("-----------------------------------------------");
        Travel t1 = new Travel();
        System.out.println(t1.getBookingDetails("Wanderlust Travels", "Paris", 2));	
        System.out.println("------------------------------------------------------------");
        System.out.println(t1.getBookingDetails("Wanderlust Travells", "Tokyo", 3));
        System.out.println("-----------------------------------------------");
        Reservation r = new Reservation();
        System.out.println(r.getReservationDetails("Grand Palace", "David", 3));	
        System.out.println("------------------------------------------------------------");
        System.out.println(r.getReservationDetails("Grand Palace", "Maria", 2));
        
	}

}
