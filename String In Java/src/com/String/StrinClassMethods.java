package com.String;

public class StrinClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="happy";
String str="beautiful";
String s2="HAPPY";
String s3="  I will come tommorow    ";
String s4="JyothsnaAnnaladasu";
String s5="happy";
System.out.println(s1.toUpperCase() );//toUpperCase() method 

System.out.println(s2.toLowerCase());//toLowerCase() method
System.out.println(s3.trim());//trim() Method
System.out.println(s4.startsWith("J"));//startsWith() method it gives true
System.out.println(s4.endsWith("u"));//endsWith() method it gives true
System.out.println(str.charAt(6));//charAt() method
System.out.println(s4.length());//length() method
String s=new String("Jyothsna");
String s41=s.intern();//intern() method
System.out.println(s41);
System.out.println(s1.equals(s2));//equals() method
System.out.println(s1.contentEquals(s5));
//System.out.println(s1.append(s2));
String x="abc";
String y="abc";
x.concat(y);
System.out.println(x);//output :abc ,the x.concat(y) will creaate a new string but its not assigned to x,so the value of x is not changed

String s6 = new String("java");
String s7 = new String("JAVA");
System.out.println(s6 = s7);// output JAVA:It will print “JAVA” because the argument inside the println() method is an assignment. So it will be treated as System.out.println("JAVA").
int value=30;  
String s8=String.valueOf(value);  
System.out.println(s8+10);//it will print 3010 because valueOf will convert string into int 
String st = null;
System.out.println(st.valueOf(10));
	}

}
