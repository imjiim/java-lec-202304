package dya09;

public class ScopeExamlpe {
 
	public static void main(String args[]) {
		Cat cat =new Cat();//객체를 생성합니다 
		cat.sayMyName();// 너 이름이뭐니 -지역 변수 임지영 출력
        cat.sayMyAge(); // 너 나이가 몇이니?- 전역(클래스)의 변수 야옹이 출력
	}
}


class Cat {
     //-클래스 맴버 (필드/변수)
	//-클래스 전역 변수 (클래스에 공유가 되는 변수)
	String name= "야옹이";
	//String name= "임지영" // 지역에 name 이라는 사람이있다 (동명이인) = 에러 
	void sayMyName() {
		//-지역 변수
		int age =10; 
		String name ="임지영"; //-우리 동네에 name 이라는 이름의 사람이있다 (동명이인)=에러아님
		System.out.println(name);
	}
	void sayMyAge() {
		System.out.println(name);
		// int age는 sayMyName() 정의부에 존재하는 
		//"지역"변수이기 때문에 접근불가 
		//String name 은 클래스 전역에서 접근하는 변수이기 때문에 접근가능
		//System.out.println("난"+name+"나이는"+age);
	}
	
}