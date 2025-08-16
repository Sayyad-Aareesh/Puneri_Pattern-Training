package com.stringex;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 =new String(" Programming");
		
		System.out.println("String 1 is : "+s1);
		System.out.println("String 2 is : "+s2);
		
		System.out.println("length of String 1 is : "+s1.length());
		System.out.println("on s1 character at 2nd position are : "+s1.charAt(1));
		
		
		//check string end with the specified word or character.
		System.out.println("String s1 ends with 'ing' or not : "+s1.endsWith("ing"));
		System.out.println("Check String s1  starts with 'pro' or not : "+s1.startsWith("ja"));
		System.out.println("Convert String s1 in upper case : "+s1.toUpperCase());
		
		String str2 =s1.toLowerCase();
		
		
		System.out.println("Convert String s1 in lower case : " +str2);
		
		
		//convert the String s1 in character array 
		
		System.out.println();
		System.out.println("convert the String s1 in character array and print it ");
		char ch[]= str2.toCharArray();
		for(int i = 0 ; i < ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		System.out.println();
		System.out.println("Add String s1 and s2 by using concate() method : ");
		System.out.println(s1.concat(s2));
		
		System.out.println();
		System.out.println("Add String s1 and s2 by using plus(+) Operator : ");
		System.out.println(s1+s2);
		
		String s3 ="";
		System.out.println("Check the length of String s3 is empty or not : "+s3.isEmpty());
		
		String s4 =" ";
		System.out.println("Check String s4 contain any blank charactor  : "+s4.isBlank());
		System.out.println("true if the string is empty or contains only white space codepoints,otherwise false");

		System.out.println("Find the index of v in String s1 : "+s1.indexOf('v'));
		
		System.out.println("Check String s1 contains specified sub string 'Ja' or not : "+s1.contains("Ja"));
		
		String s5 ="Java Programming Language Split String Example....";
		
		System.out.println("Before split String s5 is : "+s5);
		//split() : used to split the string using space or hi-fun etc.
		String str1[] =s5.split(" ");
		System.out.println("After split String s5 is : ");
		for(int i=0 ;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		
		System.out.println("Join string s1 s2 and s5  by using Sting.join() method :");
		System.out.println(String.join(" - ", s1,s2,s5));
	
	}

}
