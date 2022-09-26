package sub05;
/*
 * 날짜 : 2022/09/23
 * 이름 : 김시아
 * 내용 : 자바 총 정리 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);
		
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		System.out.println(true ^ false);
		
		System.out.println(!(a > b));
		System.out.println(!(a < b));
		
	}

}
