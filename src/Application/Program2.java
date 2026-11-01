package Application;

import java.util.Scanner;

import Model.dao.DaoFactory;
import Model.dao.DepartmentDao;
import Model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== TEST 1: findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		

		sc.close();
		
		
	
	}

}
