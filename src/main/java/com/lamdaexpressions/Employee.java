package com.lamdaexpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public int getAge() 
	{
		return age;
	}

	public String getGender() 
	{
		return gender;
	}

	public String getDepartment() 
	{
		return department;
	}

	public int getYearOfJoining() 
	{
		return yearOfJoining;
	}

	public double getSalary() 
	{
		return salary;
	}

	@Override
	public String toString() 
	{
		return "Id : "+id
				+", Name : "+name
				+", age : "+age
				+", Gender : "+gender
				+", Department : "+department
				+", Year Of Joining : "+yearOfJoining
				+", Salary : "+salary;
	}

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		System.out.println("How many male and female employees are there in the organization?");
		Map<String,Long> count =  employeeList.stream()
				.collect(
						Collectors
						.groupingBy(e->e.getGender(),
								Collectors.counting()));
		System.out.println(count);
		System.out.println("============================================================\n");

		System.out.println("Print the name of all departments in the organization?");
		employeeList
		.stream().map(e->e.getDepartment())
		.distinct().forEach(e->System.out.println(e));
		System.out.println("============================================================\n");

		System.out.println("average age of male and female employees");
		Map<String,Double> map = employeeList.stream()
				.collect(Collectors
						.groupingBy(
								Employee::getGender, 
								Collectors.averagingInt(Employee::getAge)));
		System.out.println(map);
		System.out.println("============================================================\n");

		System.out.println("Details of highest paid employee in the organization?");
		Optional<Employee> opt = employeeList
				.stream()
				.collect(Collectors
						.maxBy(Comparator.comparingDouble(e->e.getSalary())));
		System.out.println(opt.get());;
		System.out.println("============================================================\n");

		System.out.println("Get the names of all employees who have joined after 2015");
		employeeList
		.stream()
		.filter(e->e.getYearOfJoining()>2015)
		.map(Employee::getName)
		.forEach(System.out::println);
		System.out.println("============================================================\n");

		System.out.println("Count the number of employees in each department");
		Map<String,Long> countMap = employeeList
				.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.counting()));
		System.out.println(countMap);
		System.out.println("============================================================\n");

		System.out.println("What is the average salary of each department?");
		LinkedHashMap<String,Double> salMap = employeeList
				.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						LinkedHashMap::new,
						Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(salMap);
		System.out.println("============================================================\n");

		System.out.println("Get the details of youngest male employee in the product development department");
		Optional<Employee> opt1 = employeeList
				.stream()
				.filter(e->e.getGender()== "Male"&& e.getDepartment()=="Product Development")
				.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		Optional<Employee>opt11 = employeeList
				.stream()
				.filter(e->e.getGender()== "Male"&& e.getDepartment()=="Product Development")
				.min(Comparator.comparing(Employee::getAge));
					
		System.out.println(opt1.get());
		System.out.println(opt11.get());
		System.out.println("============================================================\n");

		System.out.println("Who has the most working experience in the organization");
		Optional<Employee> opt2 = employeeList
				.stream()
				.sorted(Comparator.comparing(Employee::getYearOfJoining))
				.findFirst();
		System.out.println(opt2.get());
		System.out.println("============================================================\n");

		System.out.println("How many male and female employees are there in the sales and marketing team");
		System.out.println(employeeList
				.stream()
				.filter(e->e.getDepartment()=="Sales And Marketing")
				.collect(
						Collectors
						.groupingBy(Employee::getGender,
								Collectors.counting())));
		System.out.println("============================================================\n");

		System.out.println("What is the average salary of male and female employees?");
		System.out.println(employeeList
				.stream()
				.collect(
						Collectors
						.groupingBy(
								Employee::getGender,
								Collectors.averagingDouble(Employee::getSalary))));
		System.out.println("============================================================\n");

		System.out.println("List down the names of all employees in each department?");
		Map<String, List<Employee>> empList= employeeList
				.stream()
				.collect(
						Collectors
						.groupingBy(Employee::getDepartment));
		empList.entrySet().stream().forEach(System.out::println);
		System.out.println("============================================================\n");

		System.out.println("What is the average salary and total salary of the whole organization?");
		DoubleSummaryStatistics emp = employeeList
				.stream()
				.collect(
						Collectors
						.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary of Organization : " + emp.getAverage());
		System.out.println("Total Salary of Organization : " + emp.getSum());
		System.out.println("============================================================\n");

		System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
		Map<Boolean, List<Employee>> emp3 = employeeList
				.stream()
				.collect(Collectors.partitioningBy(e->e.getAge()>25));
		System.out.println(emp3);
		for(Entry<Boolean, List<Employee>>dataMap :emp3.entrySet()) {
			if(dataMap.getKey()) {
				System.out.println("\nOlder than 25");
			System.out.println("---------------------------------");
			}else {
				System.out.println("\nYounger than and equal to 25");
				System.out.println("---------------------------------");
			}
			for (Employee employee : dataMap.getValue()) {
				System.out.println(employee.getName());
			}
		}
		System.out.println("============================================================\n");
		
		System.out.println("Who is the oldest employee in the organization? What is his age and which department he belongs to");
		Optional<Employee> opt3 = employeeList
		.stream()
		.max(Comparator.comparing(Employee::getAge));
		System.out.println(opt3.get());
	}
}
