package org.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class sett {
	public static void main(String[] args) {
		//set
		Set<Integer> j=new LinkedHashSet<>();
		j.add(40);
		j.add(80);
		j.add(78);
		j.add(60);
		j.add(40);
	 System.out.println(j);	
	//size		
	int j1 = j.size();	
	System.out.println("size is  "+j1);	
	//particular value contains or not	
	 boolean j2 = j.contains(4);	
	System.out.println("particular contains or not "+j2);	
	//remove 
	 j.remove(40);
	System.out.println("remove particular value "+j);	
	//clear	
	//j.clear();	
	//System.out.println("clear the all value  "+j);
	
	
	//empty or not
	boolean j3 = j.isEmpty();
	System.out.println("empty or not  "+j3);
	
	//get all value  
	//normal for loop.............its not working in set
	//enhanced for loop
	for(int x:j) {
	System.out.println("enhanced for loop "+x);	
	}
	//for each loop
	System.out.println("for each method ");
	j.forEach(System.out::println);
	//list
	List<Integer> l1=new ArrayList<>();
    l1.add(40);
    l1.add(50);
    l1.add(30);
    l1.add(80);
    l1.add(40);
    l1.add(30);
    l1.add(50);
    System.out.println("list value "+l1);
	
    //remove dublicate values
    Set<Integer> jj=new TreeSet<>();
    jj.addAll(l1);
    System.out.println("remove dublicate values "+jj);
    //dubalicate counts
    System.out.println("dubalicate counts  ");
    System.out.println(l1.size()-jj.size());
    //TREESET .....ascanding
    //ascii values
    Set<Character> jjj=new TreeSet<>();
    jjj.add('A');
    jjj.add('5');
    jjj.add(' ');
    jjj.add('*');
    jjj.add('a');
    jjj.add('$');
    System.out.println("ascii values "+jjj);

    
    
    
    
    
    
    
    
    
	
	}

}
