package Test1;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/30
 * 이름 : 김시아
 * 내용 : 정기 수행평가 (프로그래밍 언어 활용)
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요");
		int N = sc.nextInt();
		
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
