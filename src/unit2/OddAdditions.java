package unit2;

public class OddAdditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0;
		
		for (int i = 1; i <= 55; i++) {
			
			if (i % 2 == 0)
				continue;
				even = even + i;
				System.out.println(even);
				System.out.printf("%d \n", i);
				
		}
		
	}

}
