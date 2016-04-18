
public class RandomNumber {

	public int GetANumber(int high) {

		int computerNum = 1 + (int) (Math.random() * high);
		return computerNum;
	}

	public int GetANumber_Between_1_and_10() {

		int computerNum = 1 + (int) (Math.random() * 10);
		return computerNum;
	}
}