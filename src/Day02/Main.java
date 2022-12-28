package Day02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader;
		int score = 0;
		char[] choice;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\adamc\\eclipse-workspace\\Day02\\src\\Day02\\input.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				choice = line.toCharArray();
				if (choice[2] == 'X') {
					score += 1;
				}
				if (choice[2] == 'Y') {
					score += 2;
				}
				if (choice[2] == 'Z') {
					score += 3;
				}
			
				if (choice[0] == 'A' && choice[2] == 'X' || choice[0] == 'B' && choice[2] == 'Y' || choice[0] == 'C' && choice[2] == 'Z') {
					score += 3;
				}
				if (choice[0] == 'B' && choice[2] == 'X' || choice[0] == 'A' && choice[2] == 'Z' || choice[0] == 'C' && choice[2] == 'Y') {
					score += 0;
				}
				if (choice[0] == 'C' && choice[2] == 'X' || choice[0] == 'B' && choice[2] == 'Z' || choice[0] == 'A' && choice[2] == 'Y') {
					score += 6;
				}
				
				
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Yout total score is:" + score);
		
	}
	
}
