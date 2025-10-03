import java.util.Scanner;
public class CalculaterApp {

	public static void main(String[] args) {
		Calculater caic = new Calculater();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("平方根を求めるか階乗を求めるか選択してください");
		String num1 = scanner.nextLine();
		
		if(num1.equals("平方根")) {
			
			System.out.println("数字をひとつ入力してください。");
			double argument = scanner.nextDouble();
			
			caic.squareNumber(argument);
			
		}else if(num1.equals("階乗")) {
			
			System.out.println("整数をひとつ入力してください。");
			int num = scanner.nextInt();
			
			caic.factorial(num);
			
		}else {
			System.out.println("平方根か階乗かで選択してください");
		}
			
		scanner.close();
	}

}
