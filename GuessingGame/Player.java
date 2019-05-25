package GuessingGame;

public class Player {
	//	where the guess goes
	int number = 0;

	public void guess(int playerNumber) {
		number=(int)(Math.random()*10);
		System.out.println("Player "+playerNumber+" is guessing the number: "+number);
	}
}
