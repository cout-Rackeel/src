package oop_final_project;

import java.time.LocalDate;
import java.util.Scanner;

import RPLS_SYSTEM.Driver;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Driver driver = new Driver();
		
		driver.display();
		driver.getPersonalDetails().setFullName("Tim Haddock");
		driver.display();
		
		
	}

}
