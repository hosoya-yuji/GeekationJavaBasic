package basicSyntax;

public class MethodPractice2 {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
        int sum = sumNumbers(a, b);
        numbersResult(sum);

        int sub = subNumbers(a, b);
        numbersResult(sub);

        int multi = multiNumbers(a, b);
        numbersResult(multi);

        int divi = diviNumbers(a, b);
        numbersResult(divi);
	}

	public static int sumNumbers(int a, int b) {
		return a + b;
				
	}
	
	public static int subNumbers(int a, int b) {
		return a - b;

	}
	
	public static int multiNumbers(int a, int b) {
		return a * b;

	}
	
	public static int diviNumbers(int a, int b) {
		return a / b;
		

	}
	
	public static void numbersResult(int result) {
		System.out.println("計算結果は" + result + ": です。 ");
	}
	

		
	
}


