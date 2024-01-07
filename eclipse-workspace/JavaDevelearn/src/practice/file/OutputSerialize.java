package practice.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OutputSerialize {

	public void objWrite() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\objDemo.txt";

		try {
			FileOutputStream fout = new FileOutputStream(loc);
			String password=new String("My name is pradeep. I have done much more as I want");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(password);
			oout.close();
			fout.close();
			System.out.println("Suucess");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void objRead() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\objDemo.txt";
		try {
			FileInputStream fin = new FileInputStream(loc);
			ObjectInputStream oin = new ObjectInputStream(fin);
			System.out.println(oin.readObject());
			oin.close();
			fin.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void objTeacherWrite() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\teachDemo.txt";
		try {
			FileOutputStream fout = new FileOutputStream(loc);
			Teacher t1 = new Teacher(101,"Pradeep","pp4802pal@gmail.com","738484364","Prad123");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(t1);
			fout.close();
			oout.close();
		} catch(Exception e) {
			
		}
	}
	
	public void objTeacherRead() {
		String loc = "C:\\Users\\pradeep\\Documents\\FileJava\\teachDemo.txt";
		try {
			FileInputStream fout = new FileInputStream(loc);
			ObjectInputStream oout = new ObjectInputStream(fout);
			System.out.println(oout.readObject());
			fout.close();
			oout.close();
		} catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		OutputSerialize out = new OutputSerialize();
//		out.objWrite();
//		out.objRead();
		out.objTeacherWrite();
		out.objTeacherRead();
	}
}
