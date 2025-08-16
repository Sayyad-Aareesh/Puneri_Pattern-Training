package com.flowcontrolStatement;

import java.util.Scanner;

public class SwitcVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabete");
		char ch =sc.next().charAt(0);
		
		if(ch >='A' && ch <='Z' || ch >='a' && ch <='z')
		{
			switch(ch)
			{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
						System.out.println(ch +" Is Vowel...");
						break;
			default :
						System.out.println(ch+" Is Consonent...");
			}
		}
		
		else 
		{
			System.out.println(ch+" is Number or Any Special Charector");
		}
	}
		
}









//
//
//switch(ch)
//{
//case 1: if (ch=='A' ||ch =='a'||ch=='E'||ch=='e' ||ch=='I'|| ch == 'i'  
//		|| ch == 'O' || ch == 'o' || ch=='U' || ch=='u') {
//	System.out.println("VoWels");
//	}
//	break;
//case 2:
//	if (ch=='b' || ch =='c'||ch =='d'||ch =='f' ||ch =='g' || ch=='h'
//	
//			|| ch == 'j'  || ch == 'k'  ||ch == 'l'  ||ch == 'm' ||
//			ch == 'n'    || ch == 'p'  || ch == 'q'  || ch == 'r'  ||
//			ch == 's'  || ch == 't'  || ch == 'v'  || ch == 'w'  ||
//			ch == 'x' || ch == 'y'  ||ch == 'z') {
//		System.out.println("Consonent");
//		}
//case 3:
//	if (ch=='B' || ch =='C'||ch =='D'||ch =='F' ||ch =='G' || ch=='H'
//	
//			|| ch == 'J'  || ch == 'K'  ||ch == 'L'  ||ch == 'M'  ||ch == 'N'  ||
//			ch == 'P'    || ch == 'Q'  || ch == 'R'  || ch == 'S'  ||
//			ch == 'T'  || ch == 'V'  || ch == 'W'  || ch == 'X'  ||
//			ch == 'Y' || ch == 'Z') {
//		System.out.println("Consonent");
//		}
//	break;
//	
//default:
//		System.out.println("Not a Vowel or Consonent...");
//
//		
//	}
