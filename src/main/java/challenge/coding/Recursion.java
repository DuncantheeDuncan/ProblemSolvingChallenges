package challenge.coding;

class Recursion{

	int i =9;
	int sum;
	
	public void sumAllNumbers(){

		if (i== 0)
			return;

		sum++;i--;
		System.out.println(sum+"+"+sum+"= " +(sum+sum));

		sumAllNumbers();
	}

	public static void main(String[] args) {

		Recursion re = new Recursion();
		re.sumAllNumbers();

	}
}