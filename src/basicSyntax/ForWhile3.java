package basicSyntax;

public class ForWhile3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int num = 1; num <= 100; num++) {
			if (num % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}
			
		}
		
		String[] language = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for (String lung: language) {
			if (lung == "Java") {
				System.out.println("現在学習中の言語はJavaです。");	
				continue;
			} 
			
			if (lung == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			}

			System.out.println(lung);
			}
		
		
		

	}

}