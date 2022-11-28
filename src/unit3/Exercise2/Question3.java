package unit3.Exercise2;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		max(1, 2, max);
		System.out.println(max);
	}

	public static void max(int value1, int value2, int max) {
		if (value1 < value2)
			max += value1;
		else
			max += value2;
	}
}
