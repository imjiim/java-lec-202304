// lotto 6/45
// lotto 6/x
//java ArrayLottoExamlpe 1000
// (1~1000 중 6개 숫자를 선택하는 로또 프로그램을 만듭니다)

// 2. x/y 예를 들면 java ArrayExample 20 1000
// 1-100 까지에서 10개를 뽑아 출력하기

package day08;

 public class ArrayLottoExamlpe {

	 public static void main (String args[]) {
		 
		 if(args.length== 0 || args.length < 2 ) {
			 System.out.println
			 ("사용법: java Array LottoExample <뽑을수> <최대숫자>");
		 return;	 
		 }
		 //--사용법 통과후 진행하는곳
		 //-뽑을숫자수
		 int pickCount= Integer.parseInt(args[0]);
		 //최대숫자 (1~y)
		 
		 int maxNum = Integer.parseInt(args[0]);
		                 // 최대 숫자 (ex.lotto 6/100, 6/200)
		                 //사용자가 입력한 값을넣는 변수
		 
		 int[] lotto =new int [pickCount]; //로또 숫자는 6개라서
		 
		 //--로또번호 방에 넣기
		 for(int x= 0; x < lotto.length; x++) {
			 //랜덤한 값을 집어 넣습니다
			 int num = (int)(Math.random()* maxNum) + 1;
			 lotto[x]= num;
		 }
		 //-- 로또번호 출력하기
		 System.out.println("생성된 로또 번호");
		 for(int x =0; x < lotto.length; x++) {
			 System.out.println(lotto[x]+ "\t");
			 
		 }
		 System.out.println("\n프로그램을 종료합니다");
		 
	 }
	 
}
 
 
 
