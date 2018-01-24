package Abc;

import java.util.Scanner;

class DiceGame
{

	int diceFace;
	int userGuess;
	
	public void rollDice() 
	{
		diceFace = (int)(Math.random()*6)+1;
	}
	
	private int getUserInput(String prompt) 
	{
		System.out.print(prompt);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	private void checkUserGuess()
	{
		if(diceFace == userGuess)
		{
			System.out.print("맞았습니다.");
		}else {
			System.out.print("틀렸습니다.");
		}
	}
	
	public void startPlaying() 
	{
		userGuess = getUserInput("예상값을 입력 하세요 :");
		rollDice();
		checkUserGuess();
	}
	
	public void checkDiceFace() 
	{
		System.out.print("주사위 값은 : "+diceFace);
	}
	
}

public class DiceGameTest {

	public static void main(String[] args) {

		DiceGame diceGame = new DiceGame();
		diceGame.startPlaying();
		diceGame.checkDiceFace();

	}

}
