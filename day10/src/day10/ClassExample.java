package day10;
//클래스 정의 및 객체 생성

//class 클래스명[]
//Human 클래스 정의부

class Human{
	//필드(속성) - 객체 자신을 표헌하는 속성/상태
	//메소드(행위)- 그 객체에 행동을 표현
	//          - 자기 자신을 생성하는 행위 (생성자)
	
	//Human 클래스의 맴버가 뭐가잇나
	//"멤버"필드(속성)은 뭐뭐가 있고 
	//"멤버"메서드는 뭐뭐가있다 
	// 그리고 생성자는 뭐뭐가 잇다
	
	String name; // 이름
	
	void sayMyName () {
		System.out.println("제 이름은 "+name+"입니다");
		
	}
	//메소드 오버로딩(중첩)
	// 리턴타입이 다르거나 인자가다르거나
	void 외치다() {
		System.out.println("아아아아아");
	}
	
	String 외치다 (String userName,String starus) {
		System.out.println("뀨");
		return "욜욜욜";
	}
	void 외치다(String name) {
		System.out.println("야아아악"+name);	
	}
	//--JVM 해석방식
	//외치다는 
	//void 외치다()
	//String 외치다 (String)
	//void 외치다 (String)
}

public class ClassExample {
	
	public static void main(String []args) {
	//변수 선언
		//데이터 타입 변수명= 값;
		
		Human human = new Human ();//객체가 생성됩니다 ()= 생성자 메소드
		Human human2 = new Human ();//객체가 생성됩니다2
		Human human3 =human; //참조(주소값) 입력
		
		human.name= "임지영";
		human.sayMyName();
		human.외치다();
		human.외치다("임반달!!!");
		
		human2.name="임반달";
		human2.sayMyName();
		
		human3.sayMyName();
		if(human == human3) {
			System.out.println("h,h3는 임지영을 가르치는 참조변수(같다)");
		}

		//human 변수와 human2 변수는 같은 객체를 " 참조 " 하고있는가
		if(human!= human2) {//h,h2가 같지않으면 true
			System.out.println("h,h2는 다른객체이다");
			
			//사람이라는 클래스에서 생성된 임지영과 임반달은 다른 객체이다
			//임지영 과 임반달은 "사람"이냐 (임지영과 임반달은 Human 클래스에서 생성된 객체이냐 )
			
			if(human instanceof Human && human2 instanceof Human) {
				System.out.println("임지영과 임반달은 사람입니다");
			}

		}
		
		
	}

}
