package GoodDog;

public class GoodDog {
	//	creating the instance variable which always have to be PRIVATE
	private int size;

	//	Creating the getter(do not have args, have return type) and setters(take arg no return type), which ALWAYS have to PUBLIC
	public int getSize() {
		return size;
	}

	public void setSize(int newSize) {
		size = newSize;
	}


	//	creating a bark method
	void bark() {
		if (size > 50) {
			System.out.println("Woof! Woof!");
		}
		else if(size>14)
		{
			System.out.println("Ruff! Ruff!");
		}
		else{
			System.out.println("YIP! YIP!");
		}
	}


}
