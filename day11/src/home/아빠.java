package home;

//class 는 protected가 안됨
 public class 아빠 {
	 
	 //public int wallerBalance = 30000;
	 private int walletBalance = 30000;
	 
	 public void sayMyName() {
		 System.out.println("난 지영이 아빠야");
		
	 }
	 
	 //protected int 용돈주삼() {
		// return 10000;
	 //}

	 public int 용돈주세요() {
		 
		 if(walletBalance < 25000) {
			 System.out.println("돈 없어 시캬");
			 return 0;
		 }
		 
		 int 용돈 =1000;
		 walletBalance -=용돈;
		 System.out.println(">> 여깃다 용돈"+용돈+"원");
		 return 용돈;
		 
	 }
	 
	 // 가족이 돈달라하면 지갑이 털림
	 protected int 돈내놔() {
		 int 돈 = walletBalance;
		 walletBalance = 0;
		 return walletBalance;
	 }
	 
	 void 청소하기() {
		 System.out.println("집안 청소 싹싹");
	 }
	 
}
