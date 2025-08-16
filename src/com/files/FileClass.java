package com.files;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		File f =new File("‪F:\\Puneri Pattern\\Notes\\JAVANOTES.txt");
//		System.out.println("File name is : "+f.getName());
//		System.out.println("File Path is :"+f.getPath());
//		System.out.println("Size (length) of the File is :"+f.length());
//		System.out.println("Check it is file or any document like pdf, word , etc : "+f.isFile());
//		System.out.println("Check last time modification in file : "+f.lastModified());
//		System.out.println("Check it is readable or not : "+f.canRead());
//		System.out.println("Check it is writable ar not : "+f.canWrite());

		System.out.println(f.canRead());
	}

}
