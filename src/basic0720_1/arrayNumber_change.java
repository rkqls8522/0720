package basic0720_1;

import java.util.Scanner;

public class arrayNumber_change {
	
	static void Del_Key(int[] array, int delkey, int fillNum) {
		
		System.out.println("배열값입니다.");

		for(int i = 0; i < array.length; i++)
			System.out.printf("%3d",array[i]);
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == delkey) {
				for(int j = i; j < array.length-1; j++) {
					array[j] = array[j+1];
				}
				array[array.length-1] = fillNum;
			}
		}
		
		System.out.println("\n완료. 바꾼 후의 배열값");
		for(int i = 0; i < array.length; i++)
			System.out.printf("%3d",array[i]);
		
	}
	
	public static void main(String[] args) {
		
		
		int array1[] = {0,1,2,3,4,5,6,7,8,9};
		int array2[] = {10,20,30,40,50,60,70,80,90};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 배열번호를 고르세요.");
		int arr_num = sc.nextInt();
		
		System.out.println("삭제할 숫자를 입력하세요.");
		int delkey = sc.nextInt();
		
		System.out.println("빈자리 채울 값을 입력하세요.");
		int fillNum = sc.nextInt();
		
		switch(arr_num) {
		case 1 : Del_Key(array1, delkey,fillNum); break;
		case 2 : Del_Key(array2, delkey,fillNum); break;
		default : System.out.println("잘못된 입력입니다.");
		}
		
	}
}
