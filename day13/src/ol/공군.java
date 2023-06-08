package ol;

public class 공군 extends 군대 {
	
	//메서드 오버라이딩을 통해 부모클래스에 복무 기간 출력(); 메서드를 재정의
   // int 복무기간 = 30;
	
	@Override
	void 복무기간출력() {
		System.out.println("우린 30개월");
		
	}
	@Override
	void 일하다() {
		System.out.println("새 쫓기");
	}
	
	void 일하다(String location) {
		System.out.println(location +"눈치우기");
	}

}
