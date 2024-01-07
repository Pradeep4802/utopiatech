package practice.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_1_12 {

	public void fileWrite1() throws IOException {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\MyDemo.txt";
		FileOutputStream fout = new FileOutputStream(loc);
		byte b[] = {65,66,67,68,69,70};
		String str = "My name is pradeep";

		//		fout.write(b);
		//		fout.write(str.getBytes());
		fout.write('A');
		System.out.println("Success");
		fout.close();
	}

	public void fileRead1() throws IOException {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\MyDemo.txt";
		FileInputStream fin = new FileInputStream(loc);

		int i = 0;
		while((i = fin.read()) != -1) {
			System.out.print((char)i);
		}
		System.out.println();
		fin.close();
	}

	public void fileWriter1() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\NewText.txt";
		try {
			FileWriter fw = new FileWriter(loc);
			fw.write("I am Hero You Know");
			fw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void fileReader1() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\NewText.txt";
		try {
			FileReader fr = new FileReader(loc);
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
			fr.close();
		} catch(Exception e) {

		}
	}

	public static void main(String[] args) throws IOException {
		File_1_12 files = new File_1_12();
		//		files.fileWrite1();
		//		files.fileRead1();
		//		files.fileWriter1();
		files.fileReader1();
	}
}
