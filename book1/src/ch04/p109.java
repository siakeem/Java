package ch04;

public class p109 {
	
     public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num<=10) {//num 값이 10보다 작거나 같을 동안 
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}

}
