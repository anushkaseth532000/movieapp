package com.cignex.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {
	
	public static void PasswordEncode() {
		String bPass = null;
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		bPass = passwordEncoder.encode("12345678");
		System.out.println(bPass);
	}
	public static void main(String args[]) {
		PasswordEncode();
	}
	

}
