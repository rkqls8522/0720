package basic0720_1;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���⸦ �����մϴ�. \nù ��° �ǿ����ڸ� �Է��� �ּ���.");
		int num1 = sc.nextInt();

		System.out.println("�����ڸ� �Է��� �ּ���. (+,-,*,/,%)");
		char oper = sc.next().charAt(0);
		
		System.out.println("�� ��° �ǿ����ڸ� �Է��� �ּ���.");
		int num2 = sc.nextInt();
		
		int result = 0;
		switch(oper) {
		case ('+'): result = num1 + num2; break;
		case ('-'): result = num1 - num2; break;
		case ('*'): result = num1 * num2; break;
		case ('/'): result = num1 / num2; break;
		case ('%'): result = num1 % num2; break;
		default : System.out.println("�߸��� �Է�");
		}
		
		System.out.printf("%d %c %d = %d\n", num1, oper, num2, result);
		if(result < 0)
			System.out.printf("���� : |%d %c %d| = %d\n", num1, oper, num2, 0-result);
	
	
	
	
	}
}
