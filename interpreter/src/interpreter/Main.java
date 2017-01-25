package interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Object> vars = new HashMap<String, Object>();
		File inFile = new File(args[0]);
		Scanner scanner = new Scanner(inFile);
		while(scanner.hasNext()){
			String line = scanner.next();
			String[] lineSplit = line.split(" ");
			//might need to have a check for int or string
			if(line.contains(" = " ) && lineSplit[1].equals("=")){
				vars.put(lineSplit[0], lineSplit[2]);
			}
			if(lineSplit[0] == "PRINT"){
				System.out.println(vars.get(lineSplit[1]));
			}
		}

	}

}
