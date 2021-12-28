 package challenge.coding;

 import java.util.Arrays;

 class SortAlphabetically{

 	public static void main(String[] args) {

 		SortAlphabetically sa = new SortAlphabetically();

 		sa.sortStringArray(new String[]{
 			"Henry Bernard",
            "Cherish Davidson",
            "Joshua Norris",
            "Eleanor Kelley",
            "Jaslyn Schneider",
            "Holly Herman",
            "Andile Mhlongo",
            "Willie Strong",
            "Eliana Villa",
            "Lennon Odom",
            "Monica Velasquez",
            "Salvatore Levy",
            "Taliyah Bruce"});

 	}

 	

int checkStrings(String first, String second) {
    int len=0;

    if (first.length() >= second.length()) 
        len = second.length();
    else
        len = first.length();

    for (int i = 0; i <= len; i++) {
        if (first.charAt(i) > second.charAt(i))  //Suppose the first string letters is greater then return 1; 
            return 1;
        else if (first.charAt(i) < second.charAt(i)) //if second string letter is greater then return -1;
            return -1;
    }
    return 0;  //if both the equal then return 0
}


public  void sortStringArray(String[] array) {
    for (int i = 0; i <= array.length - 1; i++) {

        for (int j = 1; j < array.length - i; j++) { //Apply the bubble Sort
            if (checkStrings(array[j - 1], array[j]) == 1) { //Pass the two adjacent string for comparing
                String temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
    }

    for (int i = 0; i <= array.length - 1; i++) {
        System.out.println(array[i]);
    }
}

 }