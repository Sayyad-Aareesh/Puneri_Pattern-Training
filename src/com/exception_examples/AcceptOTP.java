package com.exception_examples;

import java.util.Scanner;

public class AcceptOTP {

	public static void main(String[] args) throws IlligalOTPException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter OTP :");
		String otp =sc.next();
		
		String totp ="1234"; 			//temporary OTP
		
		if(otp.equals(totp))
		{
			System.out.println("Allowed Access");
		}
		else
		{
			throw new IlligalOTPException("OTP not Matched... Please try Agin....");
		}
		System.out.println("Rest of the Code...");

	}

}
