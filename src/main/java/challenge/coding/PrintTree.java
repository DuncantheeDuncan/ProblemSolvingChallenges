package challenge.coding;

public class PrintTree {
	public static void main(String[] args) {
		
		PrintTree i = new PrintTree();

		i.levelThreeTree();
	}




	public void levelThreeTree() { 

		for (int i = 0; i < 6; i++) {

			for (int k = 0; k < 5 - i; k++)
				System.out.print(" ");
			
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			
			System.out.println();
		} 
	}



}
