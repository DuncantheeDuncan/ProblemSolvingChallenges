 package challenge.coding;

 import java.util.Arrays;

 class SortAlphabatically{
 	public static void main(String[] args) {

 		String[] names = {"phumlani","Abraham","lindokuHlE","JaCob","Andile"};
 		

		Arrays.sort(names);

 		for (String s: names)
 			System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
 


 	}

 }