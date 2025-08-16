package com.basic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails(1,"AAAA","Pune");
		List<StudentDetails> slist =new ArrayList<StudentDetails>();
		slist.add(s);
		
		slist.add(new StudentDetails(2, "BBBB", "Nasik"));
		slist.add(new StudentDetails(3, "CCCC", "Mumbai"));
		//Iterator<StudentDetails> itr =((Object) itr).entrySet();
		for(StudentDetails s1 :slist)
		{
			System.out.println(s1);
		}
	}

}
