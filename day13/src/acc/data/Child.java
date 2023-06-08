package acc.data;

// 페런드와 같은폴더(패키지)내에 존재

public class Child extends Parten {
	
	private String publicName;
	private String protectedName;

	//생성자 내에서 부모속성(멤버 변수)에 접근해보자 
	 public void Chlid() {
		 this.publicName =" 임지영"; //접근가능
		 
		 this.defaultName ="임지영";//접근 가능
		 this.protectedName="임지영";//접근가능
		 
		 //부모 클래스의 pivate 변수/ 메서드는 자식에 상속되지 않는다
		 this.privateName = "임지영"; // 접근 불가
		
	 }

}
