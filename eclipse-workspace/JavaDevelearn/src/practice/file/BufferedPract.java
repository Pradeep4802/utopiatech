package practice.file;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedPract {
	
	public void bufferedWriter() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\buffDemo.txt";
		try {
			FileWriter fw = new FileWriter(loc);
			BufferedWriter bout = new BufferedWriter(fw);
			bout.write("My life is on homestead 2");
			bout.close();
			fw.close();
			System.out.println("Success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void bufferedReader() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\buffDemo.txt";
		try {
			FileReader fr = new FileReader(loc);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
			fr.close();
			System.out.println("Success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BufferedPract bp = new BufferedPract();
//		bp.bufferedWriter 	();
		bp.bufferedReader();
	}
}
