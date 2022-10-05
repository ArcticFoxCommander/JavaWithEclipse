package unit1;

public class RNG_1d18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exp = (int)(Math.random()*19) == 0 ? 1 : 18;

		System.out.println(exp);
	}

}
