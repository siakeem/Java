package ch02;

public class p61 {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		//상수는 final이라는 예약어를 사용해 선언함
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; 이건 오류가 why? 상수값은 변경 할 수가없음
	}

}
