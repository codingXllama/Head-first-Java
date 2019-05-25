package GoodDog;

public class GoodDogTestDrive {
	public static void main(String[] args) {

//		Creating an objects of Class GoodDog
		GoodDog myFirstDog = new GoodDog();
		myFirstDog.setSize(70);

		GoodDog mySecondDog = new GoodDog();
		mySecondDog.setSize(20);

//      Printing the size of each dog, by calling the getSize method of each GoodDog class
		System.out.println("My First Dog: " + myFirstDog.getSize());
		System.out.println("My Second Dog: " + mySecondDog.getSize());

//		Calling the bark() on on each GoodDog object
		myFirstDog.bark();
		mySecondDog.bark();

	}
}
