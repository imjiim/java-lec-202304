package day17;


import java.util.*;

public class SetSortExample {
	
	public static void main(String args[]) {
		
		Set hashSet = new HashSet();
		hashSet.add(new Student("임지영",30));
		hashSet.add(new Student("임지영",20));
		System.out.println(hashSet.toString());
	}

}

class Student {//생략extends Object {
	String name;// 학생이름
	int point;// 점수
	
	//생성자
	Student(String name, int point){
		this.name = name;
		this.point = point;
		
	}
	
	//toString Override
	@Override
	
	public String toString() {
		return "name=" +this.name+",point="
				+this.point+")";
	}
	
	//hashCode();
	//equals();
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() 호출");
		return true;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode() 호출");
		return 10;
	}
}
