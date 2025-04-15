package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionAssignment5 {

	public static void main(String[] args) {

		Map<String, String> ProductRow1 = new HashMap<String, String>();

		ProductRow1.put("Product id", "P001");
		ProductRow1.put("Name", "Laptop");
		ProductRow1.put("Category", "Electronics");
		ProductRow1.put("Price", "$1,200");
		ProductRow1.put("Stock Quantity", "50");
		ProductRow1.put("Supplier", "Tech Supplies");
		ProductRow1.put("Warranty", "2Y");
		ProductRow1.put("Rating", "4.5");
		ProductRow1.put("Manufacturing Date", "1/15/2023");
		ProductRow1.put("Expiry Date", "1/15/2025");

		Map<String, String> ProductRow2 = new HashMap<String, String>();

		ProductRow2.put("Product id", "P002");
		ProductRow2.put("Name", "Desk Chair");
		ProductRow2.put("Category", "Furniture");
		ProductRow2.put("Price", "$150");
		ProductRow2.put("Stock Quantity", "100");
		ProductRow2.put("Supplier", "Office Depot");
		ProductRow2.put("Warranty", "1Y");
		ProductRow2.put("Rating", "4");
		ProductRow2.put("Manufacturing Date", "2/10/2023");
		ProductRow2.put("Expiry Date", "NA");

		Map<String, String> ProductRow3 = new HashMap<String, String>();

		ProductRow3.put("Product id", "P003");
		ProductRow3.put("Name", "Coffee Maker");
		ProductRow3.put("Category", "Kitchen");
		ProductRow3.put("Price", "$75");
		ProductRow3.put("Stock Quantity", "200");
		ProductRow3.put("Supplier", "KitchenWorld");
		ProductRow3.put("Warranty", "6 months");
		ProductRow3.put("Rating", "4.2");
		ProductRow3.put("Manufacturing Date", "3/20/2023");
		ProductRow3.put("Expiry Date", "3/20/2024");

		List<Map<String, String>> ProductList = new ArrayList<Map<String, String>>();

		ProductList.add(ProductRow1);
		ProductList.add(ProductRow2);
		ProductList.add(ProductRow3);

		// student table

		Map<String, String> Student1 = new HashMap<String, String>();
		Student1.put("Name", "John Doe");
		Student1.put("Age", "20");
		Student1.put("Gender", "Male");
		Student1.put("Roll Number", "S12345");
		Student1.put("Grade", "A");
		Student1.put("Major", "Computer Science");
		Student1.put("GPA", "3.8");
		Student1.put("Email", "john@example.com");
		Student1.put("Contact Number", "9876543210");
		Student1.put("Address", "123 Elm St");

		Map<String, String> Student2 = new HashMap<String, String>();
		Student2.put("Name", "Jane Smith");
		Student2.put("Age", "21");
		Student2.put("Gender", "Female");
		Student2.put("Roll Number", "S12346");
		Student2.put("Grade", "B");
		Student2.put("Major", "Mathematics");
		Student2.put("GPA", "3.5");
		Student2.put("Email", "jane@example.com");
		Student2.put("Contact Number", "9876543211");
		Student2.put("Address", "456 Oak St");

		Map<String, String> Student3 = new HashMap<String, String>();
		Student3.put("Name", "Mike Brown");
		Student3.put("Age", "22");
		Student3.put("Gender", "Male");
		Student3.put("Roll Number", "S12347");
		Student3.put("Grade", "A");
		Student3.put("Major", "Physics");
		Student3.put("GPA", "3.9");
		Student3.put("Email", "mike@example.com");
		Student3.put("Contact Number", "9876543212");
		Student3.put("Address", "789 Pine St");

		List<Map<String, String>> StudentsList = new ArrayList<Map<String, String>>();

		StudentsList.add(Student1);
		StudentsList.add(Student2);
		StudentsList.add(Student3);
		
	//Employee details
		
		Map<String,String> Employee1 = new HashMap<String,String>();
		
		Employee1.put("Employee ID","E001");
		Employee1.put("Name","Alice Green");
		Employee1.put("Age","30");
		Employee1.put("Gender","Female");
		Employee1.put("Department","Engineering");
		Employee1.put("Position","Software Engineer");
		Employee1.put("Salary","75,000");
		Employee1.put("Email","alice@example.com");
		Employee1.put("Contact Number","9876543213");
		
		
		
		Map<String,String> Employee2 = new HashMap<String,String>();
		
		Employee2.put("Employee ID","E002");
		Employee2.put("Name","Bob Johnson");
		Employee2.put("Age","35");
		Employee2.put("Gender","Male");
		Employee2.put("Department","Marketing");
		Employee2.put("Position","Marketing Manager");
		Employee2.put("Salary","85,000");
		Employee2.put("Email","bob@example.com");
		Employee2.put("Contact Number","9876543214");
		
		Map <String,String> Employee3 = new HashMap <String,String>();
		
		Employee3.put("Employee ID","E003");
		Employee3.put("Name","Carol White");
		Employee3.put("Age","28");
		Employee3.put("Gender","Female");
		Employee3.put("Department","Sales");
		Employee3.put("Position","Sales Executive");
		Employee3.put("Salary","65,000");
		Employee3.put("Email","carol@example.com");
		Employee3.put("Contact Number","9876543215");
		
		List <Map<String,String>> EmployeeList = new ArrayList< Map<String,String>>();
		EmployeeList.add(Employee1);
		EmployeeList.add(Employee2);
		EmployeeList.add(Employee3);

		Map<String,List <Map<String,String>>> List = new HashMap<String,List <Map<String,String>>>();
		List.put("Products",ProductList);
		List.put("Students",StudentsList);
		List.put("Employees",EmployeeList);
		
		System.out.println(List.get("Products").get(1).get("Supplier"));
		
	}

}
