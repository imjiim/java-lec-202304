package day12;

public class ThisClass {
	
	void sayMyName() {
		System.out.println("나는 ThisClass야");
	}
 public static void main (String args[]) {
	 
	 ThisClass tc= new ThisClass();
	 tc.sayMyName();
	
	 AClass a = new AClass ("임지영" ,29);
	 a.introduceMySelf();
	 
	 AClass b = new AClass ("김상오" ,35);
	 b.introduceMySelf();
	 
 }
}

class AClass{
	
	String name;
	int age;
	
	// 이 것의 생성자를만든다 
	public AClass(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	void introduceMySelf() {
		
		String name = "임반달";
		
		String message = String.format("제 이름은 %s고 제 나이는 %d입니다",this.name,this.age);
		System.out.println(message);
	}
	
	void test() {
		introduceMySelf();
		this.introduceMySelf();
		
	}
}
