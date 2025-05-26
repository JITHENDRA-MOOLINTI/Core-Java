package com.book;



import com.publisher.Publisher;

public class Book {
	
	//private instance variables
		private String title;
		private String author;
		private Publisher publisher;
		private double price;
	
		//private constructor
		private Book(String title,String author,Publisher publisher,double price) {
			this.title= title;
		    this.author=author;
		    this.publisher=publisher;
			this.price=price;	
		}
		
		//setters
		
		public void setTitle(String title) {
			this.title=title;
		}
		public void setAuthor(String author) {
			this.author=author;
		}
		public void setPublisher(Publisher publisher) {
			this.publisher= publisher;;
		}
		public void setPrice(double price) {
			
				
			    this.price=price;	
			
		}
		
		
		//getters
		public String geTtitle() {
			return this.title;
		}
		public String getAuthor() {
			return this.author;
		}
		public Publisher getPublisher() {
			return this.publisher;
		}
		public double getPrice() {
			return this.price;	
		}
		
		@Override
		public String toString() {
			return "Title Name:"+this.title+"\nAuthor:"+this.author+"\nPrice:"+this.price;
		}
		
		//Indirectly creating object of Product
		public  static Book getProducttObject(String  title,String author, Publisher publisher,double price) {
			if(title==null||title.isEmpty()||author==null||author.isEmpty()||price<=50||price>=1000){
				return null;
			}
			
			return new Book(title,author,publisher,price);
		}
}
