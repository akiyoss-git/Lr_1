package app;
import counter.*;
import adds.*;
import parser.*;
import printer.*;
import menu.*;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		String filename = in.next();
		Parser parser = new Parser(filename);
		Characters[] data = parser.parse();
		byte choose;
		do {
			choose = Menu.mein_menu();
			switch (choose){
				case 1:
					Printer.print_all(data);
					break;
				case 2:
					Counter.count(data);
					break;
				case 3:
					Printer.ptint_for_user(data);
					break;
				case 4:
					System.out.println("Close the program");
					break;
			}
		} while (choose != 4);

		//System.out.println(choose);
		//Counter.count(data);
	}

}