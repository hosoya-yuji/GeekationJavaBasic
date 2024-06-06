package objectPractice;

public class Main {

	  public static void main(String[] args) {
		    // インスタンスを生成
		    Geekdam geekdam = new Geekdam();
		    geekdam.name = "Geekdam太郎";
		    // インスタンスメソッドを呼び出し
		    geekdam.greeting();
		    
		    // geekdamインスタンスのインスタンスフィールドに値を設定します。
		    
		    geekdam.color = "red";
		    geekdam.height = 175.2;

		    // geekdamインスタンスのインスタンスフィールドの値を出力します。
		    System.out.println(geekdam.name);
		    System.out.println(geekdam.color);
		    System.out.println(geekdam.height);
		  }
		}