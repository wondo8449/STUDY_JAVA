package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("./food.txt"));
		String[] foods = {"족발", "보쌈", "짜장면", "탕수육"};
		
		for (int i = 0; i < foods.length; i++) {
			bw.write(foods[i]); 
			bw.newLine();
		}
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("food.txt"));
		String line =null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
	
}
