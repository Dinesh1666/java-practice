package org.collection;

public class string {
	public static void main(String[] args) {
	
		String s="Welcome";
		System.out.println(s);
		//length
		int kl = s.length();
		System.out.println("length "+kl);
		//isempty
		boolean s1 = s.isEmpty();
		System.out.println("is empty "+s1);
		//chartAT
	    char s2 = s.charAt(4);
		System.out.println("charcter index "+s2);
		//index of
		int s3 = s.indexOf("m");
		System.out.println("index of "+s3);
		//last indexof
		int s4 = s.lastIndexOf("e");
		System.out.println("last indexof"+s4);
		//tolowercase
		String s5 = s.toLowerCase();
		System.out.println("to lower case  "+s5);
		//touppercase
		String s6 = s.toUpperCase();
		System.out.println("to upper case  "+s6);
		//statswith
		String ss="hellow world";
		String er = "HELLOW WORLD"; 
		boolean s7 = ss.startsWith("h");
		System.out.println("starts with "+s7);
		System.out.println("starts with "+s.startsWith("e"));
		System.out.println("starts with "+s.startsWith("r"));
		System.out.println("starts with "+s.startsWith("t"));

		//endswith
		String sss = "my account";
	    boolean s8 = sss.endsWith("t");
		System.out.println("ends with "+s8);
		System.out.println("ends with "+sss.endsWith("r"));
		System.out.println("ends with "+sss.endsWith("u"));
		System.out.println("ends with "+sss.endsWith("o"));
        
		//contains
	    boolean contains = sss.contains("y");
        System.out.println("contains "+contains);
		
        //equals
        boolean ss1 = ss.equals(sss);
        System.out.println("equals or not "+ss1);
        System.out.println(ss==sss);
        //equalsignore case
        boolean ss2 = ss.equalsIgnoreCase(er);
        System.out.println("equals ignore case "+ss2);
        //concat
         String w = ss.concat(sss);
        System.out.println("concat "+w);
        //split
        String sr = "build your  dram";
         String[] erk = sr.split(" ");
         for(String x:erk) {
        	System.out.println(x); 
         }
		//replace
        String se="welcome india  ";
         String se1 = se.replace("india","china");
		//String s9 = s.replace("Welcome","welcome to java");
		System.out.println("replace"+se1);
		
		//replaceall
		 String s10 = se.replaceAll("welcome","goodmoring");
		 System.out.println("replaceall"+s10);
		 //trim
		String se2="      i was indian        ";
		String see = se2.trim();
		System.out.println("trim "+see);
		//sub string
		String sr1 = sr.substring(3);
		System.out.println("sub string "+sr1);
		
		String sr2 = sr.substring(3,12);
	    System.out.println("sub string2 "+sr2);
		//compareto
		int sw = sr.compareTo(se);
		System.out.println("compare to "+sw);
		String sr5="build your  DRAM";
		int sq = sr.compareToIgnoreCase(sr5);
		System.out.println("compareto 2"+sq);
		
		String str1="my life";
		String reversed="";
		System.out.println("original string "+str1);
		
		 String reversedstring=new StringBuilder(str1).reverse().toString();
		 System.out.println("reversed 1   "+reversedstring);
		
		for(int i=str1.length()-1 ;i>=0 ;i--) {
			reversed+=str1.charAt(i);
		}
		System.out.println("es "+reversed);
		
		//literal string
	System.out.println("==================literal string================");	
	String sw1 = "welcome";	
	String sw2 = " to my class";	
   System.out.println("  before sw1    ");
	String sw3 =sw1.concat(sw2);
	System.out.println("  After sw1    "+sw1);
    System.out.println(sw3);
    System.out.println(System.identityHashCode(sw1));
    System.out.println(System.identityHashCode(sw2));
    System.out.println(System.identityHashCode(sw3));

	// non literal string
	System.out.println("==================non literal string================");	
	StringBuffer sh1 = new StringBuffer("welcome");	
	StringBuffer sh2 = new StringBuffer(" to my class");	
    System.out.println("  before sh1    ");
	StringBuffer sh3 =sh1.append(sh2);
	System.out.println("  After sh1    "+sh1);
    System.out.println(sh3);
    System.out.println(System.identityHashCode(sh1));
    System.out.println(System.identityHashCode(sh2));
    System.out.println(System.identityHashCode(sh3));
	
    String a = "sera";
    String b=new String("sera");		 
	String c="seras";	
	System.out.println(a==b);  //compare to memory address	
	System.out.println(a.equals(b));	//compare value
	
	System.out.println(a==c);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
