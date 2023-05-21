package org.collection;

import java.util.*;

public class Listt {
	
	public static void main(String[] args) {
		
	List<Integer> li = new ArrayList<>();
	li.add(100);
	li.add(50);	
	li.add(45);	
	li.add(60);	
	li.add(45);		
		
	System.out.println("list values  "+li);	
		
	//size	
	int size = li.size();
	System.out.println("list size  "+ size);	
		
	//get particulat value	
	Integer pt = li.get(4);	
	System.out.println("get particular  "+pt);	
		
	//	particular value present or  not
	boolean pvp = li.contains(4);
	System.out.println("particular value paresent or not  "+pvp);
	
	//indexof
    int id1 = li.indexOf(45);
	System.out.println("indexof value "+id1);
	
	//lastindexof
	int id2 = li.lastIndexOf(45);
	System.out.println("lastindexof value  "+id2);
	
	//insert values b/w list
	li.add(2,100);
	System.out.println("insert value b/w list  "+li);
	
	//replace value b/w list
	li.set(2,105);
	System.out.println("replace value b/w list  "+li);

	//remove valoue b/w list
	li.remove(2);
	System.out.println("remove value b/w list  "+li);

	//cler values 
	//li.clear();
	//System.out.println("clear value  "+li);
	
	//empty or not
	boolean empty = li.isEmpty();
	System.out.println("empty or not "+empty);
	
	//new list
	List<Integer> li2 = new ArrayList<>();
	System.out.println(li2);	
	
	//add value list1 to list2
      li2.addAll(li);
	System.out.println("add full values from list1 to list2"+li2);
	
	//compare two list
	boolean equals = li2.equals(li);
	System.out.println("equals or not b/w two list"+li2);
	
	//add values list2
	li2.add(71);
	li2.add(80);
	li2.add(75);
	li2.add(90);
	li2.add(108);
	li2.add(108);
	li2.add(79);
	System.out.println("list2 values  "+li2);
	
	//get common values 
	//li2.retainAll(li);
	//System.out.println("get common values b/w two list  "+li2);
	
	//remove all common values
	li2.removeAll(li);
	System.out.println("remove all common values  "+li2);
	
	//get all values
	//normal for loop
	System.out.println("-----------normal for loop------");
	for(int i=0; i<li.size(); i++) {
	System.out.println("normal for loop  "+li.get(i));	
	}
	
	//enhanced forloop
	System.out.println("-----------enhanced for loop------");
    for(int x:li) {
    	System.out.println(x);
    }
	
    //for each loop
	System.out.println("----------- foreach loop------");
    li.forEach(System.out::println);
	
	
	
	
	
	
	
	

	}
	
	
	
	
	
	
	
	
	

}
