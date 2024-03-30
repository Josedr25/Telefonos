package com.phones.test;
import com.phones.brands.Iphone;
import com.phones.brands.Galaxy;

public class PhoneTest {
	public static void main(String[] args) {
		Iphone XII = new Iphone("12", 80, "Movistar", "Cerveza Crystal");
		XII.displayInfo();
		System.out.println(XII.ring());
		System.out.println(XII.unlock());
		Galaxy XXIV = new Galaxy("24", 50, "Entel", "TURURU TURURU");
		XXIV.displayInfo();
		System.out.println(XXIV.ring());
		System.out.println(XXIV.unlock());
	}
	
}
