package org.control;

import java.util.ArrayList;
import java.util.List;

public class company {
	public static void main(String[] args) {
		
	Employee e1=new Employee();	
	e1.setId(10);	
	e1.setName("dinesh");	
	e1.setPhno(9840123145l);	
	
	System.out.println(e1.getId());
	System.out.println(e1.getName());
	System.out.println(e1.getPhno());

	Employee e2=new Employee();	
	e2.setId(11);	
	e2.setName("dinesh kumar");	
	e2.setPhno(9840123178l);	
	
	System.out.println(e2.getId());
	System.out.println(e2.getName());
	System.out.println(e2.getPhno());

	Employee e3=new Employee();	
	e3.setId(13);	
	e3.setName("dinesh karthick");	
	e3.setPhno(9940147258l);		
	
	System.out.println(e3.getId());
	System.out.println(e3.getName());
	System.out.println(e3.getPhno());

	
	List<Employee>li=new ArrayList();
	li.add(e1);
	li.add(e2);
	li.add(e3);
	
	System.out.println(li.get(0));
	System.out.println(li.get(0).getId());	
	System.out.println(li.get(0).getName());
	System.out.println(li.get(0).getPhno());
	
	for(Employee x:li) {
	System.out.println(x.getId());
	System.out.println(x.getName());
	System.out.println(x.getPhno());
	
	System.out.println("for each loop");
	li.forEach(System.out::println);
	}
	
	
	}	

}
