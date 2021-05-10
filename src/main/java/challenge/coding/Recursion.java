package challenge.coding;

class Recursion{

	public void sumAllNumbers(int i){

		if (i== 0)return;


		sumAllNumbers(i-1);
		System.out.println(i+"+"+i+"= " +(i+i));

	}

	public static void main(String[] args) {

		Recursion re = new Recursion();
		re.sumAllNumbers(9);

	}
}