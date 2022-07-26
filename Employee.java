package com.rachid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

interface EmployeeData
{
	void operate();
}
public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int year;
	private int salary;
	static int countMale;
	static int countFemale;
	static int femaleAgeAvg;
	static int maleAgeAvg;
	static int countMaintenance;
	static int countApps;
	static int femaleSalaryAvg;
	static int maleSalaryAvg;
	
	public Employee(int id, String name, int age, String gender, String dept, int year, int salary)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.year = year;
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(100, "Rachid", 22, "male", "Apps", 2022, 60000);
		Employee emp2 = new Employee(101, "Christian", 21, "male", "Apps", 2001, 65000);
		Employee emp3 = new Employee(102, "Saran", 38, "male", "Maintenance", 1998, 100000);
		Employee emp4 = new Employee(103, "Jordan", 31, "female", "Maintenance", 2004, 75000);
		Employee emp5 = new Employee(104, "Vijay", 27, "female", "Apps", 2019, 67000);
		
		List<Employee> list = new ArrayList<>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		//1
		list.forEach((e) -> {
			if(e.gender == ("male"))
			{
				countMale++;
			}
			else if(e.gender == ("female"))
			{
				countFemale++;
			}
		});
		
		System.out.println("Male count :" + countMale);
		System.out.println("Female count :" + countFemale);
		
		//2
		list.stream().filter(e -> e.gender == "female").forEach(e -> femaleAgeAvg += e.age);
		System.out.println("Average age for females : " + femaleAgeAvg/countFemale);
		
		list.stream().filter(e -> e.gender == "male").forEach(e -> maleAgeAvg += e.age);
		System.out.println("Average age for males : " + maleAgeAvg/countMale);
		
		//3
		System.out.println(list.stream().max(Comparator.comparing(e -> e.salary)));
		
		//4
		System.out.println("Every Employee after 2015 : ");
		list.stream().filter(e -> e.year > 2015).forEach(e -> System.out.println(e.name));
		
		//5
		System.out.println(list.stream().min(Comparator.comparing(e -> e.year)));
		
		//6
		list.stream().filter(e -> e.dept == "Maintenance").forEach(e -> countMaintenance++);
		System.out.println("Employees in Maintenance " + countMaintenance);
		
		list.stream().filter(e -> e.dept == "Apps").forEach(e -> countApps++);
		System.out.println("Employees in Apps " + countApps);
		
		//7
		
		//8
		list.stream().filter(e -> e.gender == "female").forEach(e -> femaleSalaryAvg += e.salary);
		System.out.println("Average salary for females : " + femaleSalaryAvg/countFemale);
		
		list.stream().filter(e -> e.gender == "male").forEach(e -> maleSalaryAvg += e.salary);
		System.out.println("Average salary for males : " + maleSalaryAvg/countMale);
		
		//9
		list.stream().filter(e -> e.age < 30).forEach(e -> System.out.println(e.name));
		list.stream().filter(e -> e.age > 25).forEach(e -> System.out.println(e.name));
		
		//10
		list.stream().filter(e -> e.dept == "Maintenance").forEach(e -> System.out.println(e.name));
		list.stream().filter(e -> e.dept == "Apps").forEach(e -> System.out.println(e.name));
		
		
	}
}