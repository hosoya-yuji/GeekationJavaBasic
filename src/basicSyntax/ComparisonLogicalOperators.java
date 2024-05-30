package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 2;
		int b = 1;
		boolean isLessA = (a > b);
		System.out.println(isLessA);
		

		boolean isSunny = true;
		boolean isWarm = true;
		boolean weather = isSunny && isWarm;
		System.out.println(weather);
		
		int x = 1;
		int y = 2;
		boolean andResultA = (x > 0 && y % 2 == 0);
		System.out.println(andResultA);
		
		boolean hasPermission = false;
		boolean notHasPermission = !hasPermission;
		System.out.println(notHasPermission);
		
<<<<<<< HEAD
		
=======

>>>>>>> refs/heads/main
	}

}
