package Test1;

import java.util.Scanner;
/*
 * 날짜 : 2022/08/30
 * 이름 : 김시아
 * 내용 : 정기 수행평가 (프로그래밍 언어 활용)
 * 
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
		    
		    for(int j = N-1; j >= i; j--) {
		        System.out.print(" ");
		    }
		    
		    for(int j=1; j <=i; j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println("");
		}
		
	}

}
