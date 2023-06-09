package day16;

import java.lang.*; // 이게 없어도 자바는 기본적으로 자바랭 패키지는 임포트

public class ObjetExample extends Object{//extends Object 기본적으로 
		public static void main (String argsp[]) {
			
			String s1 = "임지영";
			String s2 = "임지영";
			System.out.println("s1== s2=" + (s1==s2));
			//상수 Pool (String pool)
			System.out.println(s1.hashCode()); //객체당
			System.out.println(s2.hashCode());
			System.out.println(System.identityHashCode(s1));//참조 변수당
			System.out.println(System.identityHashCode(s2));
			
			System.out.println("----------------------------------");
			
			String s3 = new String("임지영");
		    String s4 = new String("임지영");
		    System.out.println("s3== s4=" + (s3==s4));
		    System.out.println(s3.hashCode());
		    System.out.println(s4.hashCode());
		    System.out.println(System.identityHashCode(s3));
		    System.out.println(System.identityHashCode(s4));
		    
		    System.out.println("s3.equalals(s4)=" + s3.equals(s4));
		    
		    
		    System.out.println("임지영".toString());
		    
		    Student std = new Student("임지영",1);
		    System.out.println(std); //System.out.println(std.toString());
		}

}

class Student {
	
	String name;
	int grade;
	//생성자
	
	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		
		
	}
	
	//오버라이딩(Object 클래스에 있는 메소드를)
	@Override
	public String toString() {
		return "class Student {name= "+ name + ",gade=" + grade+"}";
		
	}
	
}
