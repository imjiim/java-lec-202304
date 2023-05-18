package dya09;

//메서드(행위) 만들기 -함수
//(접근제한자)리턴타입 매서드명 (매개변수) {
//.. 실행문(메서드 정의부)
//}

public class MethodExample {
	
	// add 라는 메서드를 작성하겟다
	int add(int x, int y){
		return x + y;
	}
	
	void bark(String name) {
		System.out.println(" 내 이름은 "+name + ",멍멍");
		//void 를 리턴하고 싶을때는 return; 을 하면된다 
	}
	
	void sayMyName() {
		System.out.println("내 이름은 임지영 이야");
	}
	
	public static void main(String[] args) {
		
		MethodExample ex = new MethodExample(); // 메모리가 돌아갈수있게 결과 값을 올린다
		int result = ex.add(10,11); // . 은 참조 연산자
		System.out.println(result);
		
		ex.bark("후추"); // int 가 들어가는 경우 리턴값이 없으므로 void 에러가 난다
		
		
		
		
	}

}
