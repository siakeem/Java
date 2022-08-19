package sb01;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
				
		System.out.println("입력한 점수는 "+score+"입니다.");		
		
		if(score >= 90 && score <= 100)
		  grade = 'A';
	     }else if (score >= 80 && score < 90) {
		  grade = 'B';
          }else if (score >= 90 && score <= 100) {
            grade = 'c';
          }else if (score >= 90 && score <= 100) {
        	  gread = 'D';
          }else {
        	  grade = 'F';
          }
	     
	    

		}


	}

}
