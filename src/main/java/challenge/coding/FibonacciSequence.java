package challenge.coding;

public class FibonacciSequence {

	public void printFBSequence(int firstNumber,int secondNumber,int stopAt){

		for (int i=0;i<stopAt;i++) {
			
		// print the first nth number
			System.out.print("|"+firstNumber);

		// add first position and second position
			int totalNthNumber= firstNumber+secondNumber;

		// swap values the second to be first
			firstNumber=secondNumber;

			secondNumber=totalNthNumber;

		}


	}
	public static void main(String[] args) {

		FibonacciSequence fb = new FibonacciSequence();

		System.out.println();

		fb.printFBSequence(5,1,10);

		System.out.println();

	}

}
