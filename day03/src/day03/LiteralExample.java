package day03;

/*
 * 이름: 임지영
 * 사는곳: 서울 강서구
 * 직장: 서울강서구
 */

public class LiteralExample {
    public static void main (String args[]) {

    	
    	//상수 
    	double pi=3.14;
    	pi = 3.15; //오류가 나지 않음 (pi눈변수니깐)
    	
    	final double PI = 3.14;
    	//PI =3.15; //불변인 상수르 중간에수정하고자 하면 컴파일에러
    	
    	final double MAX_AGE;
    	MAX_AGE= 10; //오류는 아니지만 지양해야됨
    	
    	
    	//리터럴은 \n,\t,\ 등 문자열을 출력/저장 하고 싶을때 사용하는
    	//규칙 (escape seqence)
	System.out.println("이름: 임지영\n");
	System.out.println("사는곳: 서울 강서구\n");
	System.out.println("직장: 서울 강서구\n");
	System.out.println("\"안녕하세요\"");
    }
}
