package com.flowcontrolStatement;

public class ElseIfLadderEx {

	public static void main(String[] args) {
		
		char ch ='-';
		if(ch >= 'A' && ch<='Z')
		{
			System.out.println("Capital Alphbate");
		}
		else if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("Small Alphbate");
		}
		else if(ch >='0' && ch<='9')
		{
			System.out.println("Digit");
			
		}
		else
		{
			System.out.println("Special Character");
		}

	}

}
