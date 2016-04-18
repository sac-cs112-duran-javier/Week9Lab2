import java.util.Scanner;

public class GuessANumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RandomNumber myRandomNumber = new RandomNumber();
		int userMax;
		int userNum;
		
		System.out.print("Enter a maximum number from which to guess: ");
		userMax = input.nextInt();
		
		int computerNum = myRandomNumber.GetANumber(userMax);
		
		System.out.print("Enter a number: ");
		userNum = input.nextInt();
		
		if (userNum > computerNum)
			System.out.print("Your number is too big");
		
		if (userNum < computerNum)
			System.out.print("Your number is too small");
			
		if (userNum == computerNum)
			System.out.print("Your number is correct");

		System.out.print("\n\nThe correct number is ");
		System.out.print(computerNum);
	}

}