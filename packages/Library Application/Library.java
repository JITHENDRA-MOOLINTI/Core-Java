package com.library.books;

public class Library {
    private String lbName;
    private int totalBooks;
    
    public void setlbName(String lbName) {
    	this.lbName=lbName;
    }
    public void setTotalBooks(int totalBooks) {
    	this.totalBooks=totalBooks;
    }
    
    public String getlbName() {
    	return lbName;
    }
     
    public int getTotalBooks() {
    	return totalBooks;
    }
    
    public void showLibraryInfo() {
    	System.out.println("Library Name: "+lbName+"\nTotal Books: "+ totalBooks);
    }
    
}
