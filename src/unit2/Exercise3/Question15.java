package unit2.Exercise3;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 1;

		for(int count = 100; count <= 200; ++count) {
			if(count % 5 == 0 ^ count % 6 == 0)
				if(lines <= 10){
					System.out.printf("%4d ", count);
					lines++;
				}
				else {
					System.out.println("");
					System.out.printf("%4d ", count);
					lines = 2;
				}

		}
	}

}
