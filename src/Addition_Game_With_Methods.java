
public class Addition_Game_With_Methods {
	public static void main(String[] args) {
		additionGameMethod();
	}
	public static int randomNumberGenerator(){
		int randomNumber1 = 0;
		int randomNumber2 = 0;
		randomNumber1 = (int)(Math.random() * 10);
		randomNumber2 = (int)(Math.random() * 10);
		return randomNumber1 + randomNumber2;
	}
	public static void additionGameMethod(){
		randomNumberGenerator();
		int randomNumber1 = 0;
		int randomNumber2 = 0;
		for(int roundNumber = 0; roundNumber<2; roundNumber++){
			System.out.println("What is " + randomNumber1 + " + "  + randomNumber2 +" ?");
		}
	}
}