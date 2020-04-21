package app;
import adds.*;
import parser.*;

public class App {

	public static void main(String[] args) {

		Parser parser = new Parser("notes3.txt");
		Characters[] data = parser.parse();
		for (Characters chars: data
			 ) {
			System.out.println(chars);
		}
		//parser.write();

	}

}