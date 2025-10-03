import java.util.Scanner;
public class CalculaterApp {

	public static void main(String[] args) {
		Calculater caic = new Calculater();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~6の中から選択してください");
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		System.out.println("3:掛け算");
		System.out.println("4:割り算");
		System.out.println("5:平方根");
		System.out.println("6:階乗");
		String num1 = scanner.nextLine();
		
		if(num1.equals("1")) {
			
			System.out.println("1つ目の数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("2つ目の数字を入力してください");
			double argument2 = scanner.nextDouble();
			caic.add(argument1,argument2);
			
		}else if(num1.equals("2")) {
			
			System.out.println("1つ目の数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("2つ目の数字を入力してください");
			double argument2 = scanner.nextDouble();
			caic.sub(argument1,argument2);
			
		}else if(num1.equals("3")){
			
			System.out.println("1つ目の数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("2つ目の数字を入力してください");
			double argument2 = scanner.nextDouble();
			caic.mul(argument1,argument2);
			
		}else if(num1.equals("4")) {
			
			System.out.println("1つ目の数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("2つ目の数字を入力してください");
			double argument2 = scanner.nextDouble();
			caic.div(argument1,argument2);
			
		}else if(num1.equals("5")) {
			
			System.out.println("数字をひとつ入力してください。");
			double argument = scanner.nextDouble();
			caic.squareNumber(argument);
			
		}else if(num1.equals("6")) {
			
			System.out.println("整数をひとつ入力してください。");
			int num = scanner.nextInt();
			caic.factorial(num);
			
		}else {
			System.out.println("1~6の中から選択してください");
		}
		
		scanner.close();
	}

}
