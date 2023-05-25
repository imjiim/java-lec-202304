package day10;

public class ConstructorExample {

	public static void main (String[] args) {
    
		Animal an1 = new Animal();
		//an1.name = "갱애지";
		an1.whoIam();
		
		Animal an2 = new Animal("후추");
		an2.whoIam();
		
		Animal an3 = new Animal(" 반달이","강아지");
		an3.whoIam();
		
	} //메소드는 행위인데 자기자신을 메모리에 올리는 생성자 메소드와 그 객체의 행위를 정의하는 멤버 메소드 2가지 이다
	//생성자는 객체를 클래스설계시 클래스 속성에다 값을 넣고싶을때 사용한다
	
	
}
