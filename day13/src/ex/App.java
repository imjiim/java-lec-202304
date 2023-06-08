package ex;

/*실행시킬 어플리케이션*/

public class App {
 public static void main (String[] args) {
	 
	 Parent parent = new Parent("name 인자");//new 클랫 생성자 
	 Child child = new Child ();//new 클래스 생성자
	 
	parent.밥먹다();//parten 객체의 밥먹다 호출
	child.밥먹다();//child 객체의 밥먹다 호출
	child.부모님밥먹다();
	// > child 객체의 부모님밥먹다 () ->super(부모객체)의 밥먹다();
	 
 }
}
