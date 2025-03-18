package com.datastruc.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> listEmp=new ArrayList<>();
		listEmp.add(new Employee(1,"Raj",8000,new Department("Accounts")));
		listEmp.add(new Employee(1,"Raj",12000,new Department("IT")));
		listEmp.add(new Employee(1,"Raj",16000,new Department("IT")));
		listEmp.add(new Employee(1,"Raj",18000,new Department("IT")));
		listEmp.add(new Employee(1,"Raj",17000,new Department("Sales")));
		listEmp.add(new Employee(1,"Raj",7000,new Department("Accounts")));
		listEmp.add(new Employee(1,"Raj",15000,new Department("IT")));
		Map<Department,Long> deptMap=listEmp.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		deptMap.entrySet().stream().forEach(m-> System.out.println(m.getKey().getName()+":"+m.getValue()));
		System.out.println("####################################################################");
		//dept name with highest num employee
		Department d=listEmp.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(d.getName());
		
		deptMap.entrySet().stream().filter(m->m.getValue()>3).forEach(m->System.out.println("Dept:"+m.getKey().getName()));
		
		System.out.println("####################################################################");
       //Dept wise highest salary
		
		listEmp.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
		.entrySet().stream().forEach(m->System.out.println(m.getKey().getName()+":"+m.getValue().get().getSalary()));;
	}

}
