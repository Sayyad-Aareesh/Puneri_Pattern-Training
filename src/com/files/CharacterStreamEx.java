package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEx {

	public static void main(String[] args) throws IOException {
//		FileReader fr =new FileReader("‪F:\\FileHandling\\CharacterStream.txt");
//		int ch;
//		//ch=fr.read();
//		
//		while((ch=fr.read()) !=-1)
//		{
//			System.out.println((char)ch);
//		}
//		fr.close();

		//remove previous data and  write new  data on file
		
		//		FileWriter fw =new FileWriter("F:\\FileHandling\\CharacterStream.txt");
//		fw.write("Hello This is write by FileWriter Class...");
//		fw.flush();
//		System.out.println("Data Add Sucessfully on file");
//		fw.close();
		
		//write data after the old data
		FileWriter fw =new FileWriter("F:\\FileHandling\\CharacterStream.txt",true);
		fw.write(" , thoug java program.");
		fw.flush();
		fw.close();
		System.out.println("Data Update Sucessfully on file");

	}

}
