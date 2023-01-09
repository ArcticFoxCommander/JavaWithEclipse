package unit4.Exercise2;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 2, 3, 5, 4};
		
		for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
			
		}
		
		System.out.println(list);
		
	}

}
