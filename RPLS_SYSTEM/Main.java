package RPLS_SYSTEM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int option;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n*****WELCOME TO THE TICKET AND PPV CONTROL SYSTEM******\n");
		System.out.println("Select System to access:\n"
						  + "\t1. RPLS (Red Plate Licensing System)\n"
						  + "\t2. TIOCS (Red Plate Licensing System)\n:");
		
		option = scanner.nextInt();
		
		switch(option) {
			case 1:
				new RPLS();
			break;
			
			case 2:
			break;
			
			default:
			break;
		}
		
	}

}
