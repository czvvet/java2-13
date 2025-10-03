
public class Calculater {
	
	//足し算
	void add(double decimalAdd1,double decimalAdd2) {
		double answerAdd = decimalAdd1 + decimalAdd2;
		System.out.println(answerAdd);
	}
	
	//引き算
	void sub(double decimalSub1,double decimalSub2) {
		double answerSub = decimalSub1 - decimalSub2;
		System.out.println(answerSub);
	}
	
	//かけ算
	void mul(double decimalMul1,double decimalMul2) {
		double answerMul = decimalMul1 * decimalMul2;
		System.out.println(answerMul);
	}
	
	//割り算
	void div(double decimalDiv1,double decimalDiv2) {
		double answerDiv = decimalDiv1 / decimalDiv2;
		System.out.println(answerDiv);
	}
	
	//平方根
	void squareNumber(double decimal) {
		double answer = decimal * decimal;
		System.out.println(answer);
	}
	
	//階乗
	void factorial(int number) {
		int answer = 1;
		
		while(number > 1) {
			answer *= number;
			number--;
		}
		
		System.out.println(answer);
	}
}
