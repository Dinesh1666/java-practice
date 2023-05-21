package org.array;

import java.util.ArrayList;
import java.util.List;

public class Arrayclass {
	
	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=10;
		a[1]=120;
		a[3]=10;
		a[4]=130;
		a[4]=10;
		a[4]=20;
		a[3]=10;
		a[5]=40;
		


	//another way
      int b[]= {1,4,2,3,5,2,15,27};

     //get particular
	System.out.println(a[4]);	
	System.out.println(b[4]);	
		
	//get length
	System.out.println(a.length);
	System.out.println(b.length);	
	
	int l1 = a.length;
	int l2 = b.length;

    System.out.println("normal for loop");
    for(int i=0; i<a.length; i++) {
    	System.out.println(a[i]);
    }
		
	System.out.println("enhanced for loop");	
		
		for(int x:a) {
			System.out.println(x);
		}
	
		
	List<Integer>lk=new ArrayList();	
	lk.add(l1);
	lk.add(l2);

	
	System.out.println("for each loop");
	lk.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
