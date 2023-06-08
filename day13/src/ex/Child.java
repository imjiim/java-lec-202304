package ex;

public class Child extends Parent{ 

//기본 생성자 정의 
	public Child() {
		
		//자식에서 부모의 갹체를 생성하는 코드를 넣으면된다
		
		super("임지영");// <--내 부모의 객체를 먼저 생성
		//this <--자기자신
		System.out.println("Child 객체 생성");
	}

    void 밥먹다() {
//    	this.부모님밥먹다();
    	System.out.println("자식이 밥을 먹다");
    }
    //Parent 객체의 밥먹다 (); 메소드를 호출
   void 부모님밥먹다() {
	   super.밥먹다();
   }
}
