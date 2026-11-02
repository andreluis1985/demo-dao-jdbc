package Application;

import java.util.List;
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
		
		
		System.out.println("=== TEST 2: findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
		    System.out.println(d);
		}
		
		
		

		sc.close();
		
		
	
	}

}
