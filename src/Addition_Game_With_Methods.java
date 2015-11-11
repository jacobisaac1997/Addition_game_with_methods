
public class Addition_Game_With_Methods {
	public static void main(String[] args) {
		int randomNumber1 = 0;
		randomNumber1 = randomNumberGenerator();
		System.out.println(randomNumber1);
	}
	public static int randomNumberGenerator(){
		int randomNumber1 = 0;
		randomNumber1= (int)(Math.random() * 10);
		return randomNumber1;
	}
}