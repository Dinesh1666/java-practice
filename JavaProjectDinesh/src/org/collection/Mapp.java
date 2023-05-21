package org.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapp {
	public static <I> void main(String[] args) {
	 Map<Integer,String> mp = new LinkedHashMap<>();
     mp.put(10, "oops");	
	 mp.put(40,"selenium" );
	 mp.put(50,"git" );
	 mp.put(40,"jenkins" );
	 mp.put(60, "bdd");
	 mp.put(70,"testng" );
    System.out.println("map values "+mp);
	 
	//size 
	int mp1 = mp.size(); 
	System.out.println("size "+mp1);
	//get particuar value
    String r = mp.get(50);	
	System.out.println("get particular "+r);
	//get keys 
	String rr = mp.get("git");
	System.out.println(rr);
	 
	//values only displayes
	 Collection<String> r1 = mp.values();
	 System.out.println("values only "+r1);
	//display keys only 
	Set<Integer> r2 = mp.keySet();
	 System.out.println("keys only "+r2);
	 
	 //contains key
	 boolean rt = mp.containsKey(40);
	 System.out.println("cointaina key "+rt);
	 
	 //contains value
	 boolean rt1 = mp.containsValue("bdd");
	 System.out.println("contains  values "+rt1);
	 
	 //remove 
	 System.out.println("before remove "+mp);
	 String rt2 = mp.remove(40);
	 System.out.println("after remove "+rt2);
	 
	 //clear
	// mp.clear();
	// System.out.println("clear "+mp);
	 
	 //isempty
	 boolean rt3 = mp.isEmpty();
	 System.out.println("isempty "+rt3);
	 //key&value pairing combation
	  Set<Entry<Integer, String>> es = mp.entrySet();
	 System.out.println(es);
	 
	 //get all values
	 //using entryset
	 for(Entry<Integer, String> x:es) {
		 System.out.println(x);
		//only key 
		System.out.println(x.getKey()); 
		//only values
		System.out.println(x.getValue()); 
		 
		
		
	 }
	 
	}

}
