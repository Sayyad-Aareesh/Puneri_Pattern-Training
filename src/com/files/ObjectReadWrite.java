package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {

	public static void main(String[] args) throws IOException ,FileNotFoundException, ClassNotFoundException{
//		Student s =new Student(11, "asdf", "Jalna", 89.90);
//		FileOutputStream fout = new FileOutputStream("‪F:\\FileHandling\\ObjectStreamEx.txt");
//		ObjectOutputStream out = new ObjectOutputStream(fout);
//		out.writeObject(s);
//		out.flush();
//		fout.close();
//		System.out.println("Data add Sucessfully...");
//		
		FileInputStream fin =new FileInputStream("‪F:\\FileHandling\\ObjectStreamEx.txt");
		ObjectInputStream in =new ObjectInputStream(fin);
		Student s1 = (Student) in.readObject();
		System.out.println(s1);
		fin.close();
		
		

	}

}
