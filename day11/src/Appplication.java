//import home.임지영;
import home.*;

public class Appplication {
	
  public static void main(String[] args) {
	  
	  int 지갑 = 0;
	  
	  임지영 a= new 임지영();
	  a.sayMyName();
	  a.sayMotherName();
	  
	  아빠 b = new 아빠();
	  b.sayMyName();// public 누구나 부를수있다
	  지갑+= b.용돈주세요();
	  지갑+= b.용돈주세요();
	  지갑+= b.용돈주세요();
	  지갑+= b.용돈주세요();
	  지갑+= b.용돈주세요();
	  지갑+= b.용돈주세요();
	  지갑+= b.용돈주세요();
	  System.out.println("임지영 아빠한테 삥뜯음");
	  System.out.println("내 지갑에는 "+지갑+"원이 있어요");
	 
	  
	  //b.용돈주세요();//portetcted 는 상속 관계 에서만 호출가능
	  //b.청소();// default 는 같은방(패키지)에 있는 가족만 호출가능
	  
	 // b.walletBalance = 10000;
	  //아빠 지갑이 public 이기 때문에 
	  //누구든 값을 변경할수있는 상태
	  //System.out.println("아빠 지갑에는"+ b.walletBalance + " 원이 있어요");
	 
	  //a.sayMyAge();
	  
	  //엄마 b = new 엄마();
	  
		
		 
  }
}
