package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		
//		String[] fishs = {"갈치", "대구", "돔", "고등어"};
//		BufferedWriter bw = new BufferedWriter(new FileWriter("fish.txt"));
//		
//		for (String fish : fishs ) {
//			bw.write(fish);
//			bw.newLine();
//		}
//		bw.close();
		
//		수정
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("fish.txt"));
//			
//			String line = null;
//			String temp = "";
//			
//			while((line = br.readLine()) != null) {
//				if(line.equals("대구")) {
//					temp += "개복치\n";
//					continue;
//				}
//				temp += line + "\n";
//			}
//			br.close();
//			
//			BufferedWriter bw = new BufferedWriter(new FileWriter("fish.txt"));
//			bw.write(temp);
//			bw.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("경로 문제 발생");
//		}
		
//		개복치 삭제
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("fish.txt"));
			
			String line = null;
			String temp = "";
			
			while((line = br.readLine()) != null) {
				if(line.equals("개복치")) {
					temp += "";
					continue;
				}
				temp += line + "\n";
			}
			br.close();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("fish.txt"));
			bw.write(temp);
			bw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("경로 문제 발생");
		}
		
	}
}
