package interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File(args[0]);
		Scanner scanner = new Scanner(inFile);
		while(scanner.hasNext()){
			String line = scanner.next();
			String[] lineSplit = line.split(" ");
			if(lineSplit[0] == "PRINT"){
				
			}
		}

	}

}
