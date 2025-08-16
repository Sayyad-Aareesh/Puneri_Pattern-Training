package com.exception_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckException {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Checked Exception Example using File Reader Class...");
		
		FileInputStream fin = new FileInputStream("‪F:\\FileHandling\\First.txt");
		System.out.println("File Found...");
	}
//	try {
//		FileInputStream fin = new FileInputStream("F:\\FileHandling\\First.txt");
//		int i= 0;
//		while((i = fin.read()) != -1)
//		{
//			System.out.print((char)i);
//		}
//		fin.close();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

}
