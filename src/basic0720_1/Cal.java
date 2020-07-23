package basic0720_1;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계산기를 실행합니다. \n첫 번째 피연산자를 입력해 주세요.");
		int num1 = sc.nextInt();

		System.out.println("연산자를 입력해 주세요. (+,-,*,/,%)");
		char oper = sc.next().charAt(0);
		
		System.out.println("두 번째 피연산자를 입력해 주세요.");
		int num2 = sc.nextInt();
		
		int result = 0;
		switch(oper) {
		case ('+'): result = num1 + num2; break;
		case ('-'): result = num1 - num2; break;
		case ('*'): result = num1 * num2; break;
		case ('/'): result = num1 / num2; break;
		case ('%'): result = num1 % num2; break;
		default : System.out.println("잘못된 입력");
		}
		
		System.out.printf("%d %c %d = %d\n", num1, oper, num2, result);
		if(result < 0)
			System.out.printf("절댓값 : |%d %c %d| = %d\n", num1, oper, num2, 0-result);
	
	
	
	
	}
}
