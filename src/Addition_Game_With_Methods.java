import java.util.Scanner; 
public class Addition_Game_With_Methods {
	public static void main(String[] args) {
		additionGameMethod();
	}
	public static boolean checkAnswer(){
		if(userAnswer == correctAnswer){
			
		}
		return false;
	}
	public static void additionGameMethod(){
		Scanner input = new Scanner(System.in);
		int randomNumber1 = 0;
		
		for(int roundNumber = 0; roundNumber<2; roundNumber++){
			System.out.println("What is " + randomNumber1 + "?");
		}
	}
}