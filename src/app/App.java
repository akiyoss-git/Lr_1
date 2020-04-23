package app;
import counter.*;
import adds.*;
import parser.*;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		String filename = in.next();
		Parser parser = new Parser(filename);
		Characters[] data = parser.parse();
		Counter.count(data);
	}

}