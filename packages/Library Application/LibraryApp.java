package com.library.app;

import com.library.books.Library;
import com.library.staff.Librariyan;

public class LibraryApp {

	public static void main(String[] args) {
		
		Library l = new Library();
		Librariyan l1 = new Librariyan();
		l.setlbName("Netaji Library");
		l.setTotalBooks(20000);
		l1.setLibrariyanName("Jithendra");
		l1.setYearsOfExp(3);
		l.showLibraryInfo();
		l1.showLibrarynInfo();;
	}

}
