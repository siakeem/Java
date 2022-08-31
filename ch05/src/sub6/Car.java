package sub6;

//클래스 정의 
public class Car { //class는 그룹이라는 의미
	
	//자동차의 속성(변수)
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자
	public Car (String name, String color,int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
		
	}

	
	
	//자동차의 기능(메서드)
    public void speedUp(int speed) {
    	this.speed += speed;
    }	
    public void speedDown(int speed) {
    	this.speed -= speed;
    }	
    public void show() {
    	System.out.println("차량명 : "+this.name);  //this를 써도되고 안써도 됨.
    	System.out.println("차량색 : "+this.color);
    	System.out.println("속도 : "+this.speed);
    	
    }	

}
