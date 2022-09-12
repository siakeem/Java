package sub1;

public class FruitBox<T> { //제네릭 문법 표기 <>
	
	private T fruit; //치환변수라 대문자
	

    public T getFruit() {
		return fruit;
	}
    public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
