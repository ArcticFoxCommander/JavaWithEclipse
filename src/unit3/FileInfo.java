package unit3;

import java.util.Scanner;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the file name (INCLUDE FILE EXTENSION): ");
		String i = input.next();
		
		input.close();
		
		java.io.File file = new java.io.File(i);
		System.out.println("Does it exist? " + file.exists());
		System.out.println("File Size: " + file.length() + " bytes");
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
	}

}
