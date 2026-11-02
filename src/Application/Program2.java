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
		
		 System.out.println("=== TEST 3: Department Insert ===");
	        Department newDepartment = new Department();
	        newDepartment.setName("Games");
	        departmentDao.insert(newDepartment);
	        System.out.println("Inserted! New Id: " + newDepartment.getId());
	        
	     System.out.println("=== TEST 4: Department Update ==="); 
	        dep = departmentDao.findById(1);
	        dep .setName("Tools");
	        departmentDao.update(dep);
	        System.out.println("Update Completed!!");
	        
	     System.out.println("=== TEST 5: Department Delete ===");  
	        System.out.print("Enter Id for Delete: ");
	        int del = sc.nextInt();
	        departmentDao.deleteById(del);
	        System.out.println("Delete Complete!!");
	        
	        
	       sc.close(); 

		}
	}
	


