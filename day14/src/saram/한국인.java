package saram;

public class 한국인 extends 사람 
implements 아버지인터페이스,직장인인터페이스 {
	   
String name = "";

한국인(String name){
this.name = name;
}

@Override
void 배채우다() {
System.out.println("한국인은 밥을먹지");
}

@Override
public void 애랑놀아주다() {
//TODO Auto-generated method stub
System.out.println("한국인: 나는 제기차기하면서 놀아주지");
}

@Override
public void 출근() {
// TODO Auto-generated method stub
System.out.println("8시출근");
}

@Override
public void 퇴근() {
// TODO Auto-generated method stub
System.out.println("5시퇴근");
}
}