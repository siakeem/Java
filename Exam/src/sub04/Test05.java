package sub04;
/*
 * 날짜 : 2022/09/16
 * 이름 : 김시아
 * 내용 : String, Wrapper 클래스 연습문제
 */

public class Test05 {
	public static void main(String[] args) {
		
		String strCsv = "60,72,82,86,92";
		String[] score = strCsv.split(",");
				
		int total = 0;
		
		for(int i=0 ; i<score.length; i++) {
			
			total += scores[i];
		}
		
		System.out.println("총점 : "+total);
	}

}
