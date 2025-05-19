package com.comapy.app;
import  com.company.hr.*;
import com.comapny.admin.Departement;
public class CompanyApp {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Departement obj2 = new Departement();
        obj1.setId(1);
        obj1.setName("teja");
        obj1.setSalary(20000);
        obj1.showEmployeeInfo();
        obj2.setDeptId(2);
        obj2.setDeptName("java");
        obj2.showDepartmentDetails();
	}

}
