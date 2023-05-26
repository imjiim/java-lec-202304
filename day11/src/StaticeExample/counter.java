package StaticeExample;

//웹 어플리케이션의 카운터
public class counter {
	
	// static 키워드는
	// 멤버변수,메서드
	
	int dynamicCounter = 0;// 인스턴스 변수(객체 변수) , 객체가 생성될때마다 삭제됨,메모리의 힙영역에 들어감 전체 클래스는 매서드에 들어감
	static int staticCounter = 0;//정적변수, 얘는 매서드에 들어간다
	
	//인스턴스 메서드 (객체 메서드) = 동적
	
	public void plusdynamicCounter() {
		dynamicCounter ++;
	}
	//정적 메서드 = 정적 (메서드 area 에 한번만할당)
	public void plusDynamicCounter() {
		
	}
	
	

}
