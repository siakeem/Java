package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	 
	//동기화 블럭 synchronized : 스레드간 경합을 막고 동기방식으로(순차적으로)실행 
	public synchronized void setNum() {
		num++;
	}

}
