//1.자바 소스의 구조 
//+ a) 자바는 모두 클래스/인터페이스로 정의된다
// b) 클래스는 속성/메소드로 이루어 진다 

/*
a-1) 클래스 선언
 
class 클래스명 {

b-1 )속성은 변수/상수.. 그 클래스의 상태를 결정하는 내용
int age:
 
b-2) 메소드는 행위 
리턴타입 메소드명 () {
}

interface 인터페이스명 {
}
*/

// 2. 주석
// 한줄주석/ 여러줄 주석이 있다 
 
//<-- 한줄주석
  
/*
   <--이게 여려줄 주석
*/

package day03; 

public class Day03First {

	int maxAge=40;// 최대 나이는 40이다

	//메인메소드 =어플리케이션 스타팅, 프로젝트 시작시 무조건하나의 메인메소드는 있어야한다  
	public static void main(String ages[]) {
		System.out.println("히히히");
	}
	
}
