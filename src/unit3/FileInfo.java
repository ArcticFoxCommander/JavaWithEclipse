package unit3;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("astolfoooooo.mp4");
		System.out.println("Does it exist? " + file.exists());
		System.out.println("File Size: " + file.length() + " bytes");
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
	}

}
