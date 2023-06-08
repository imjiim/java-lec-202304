package military;

public class App {

   
   public static void main(String args[]) {
      
      군대[] military = new 군대[2]; //배열공간만 만듬
                           //추상클래스 타입의 방은 만들수있다 
      //군대 a= new 군대();-반조립 설계도인 추상클래스는 new를 통한 객체생성 불가
      
      military[0]= new 공군();
      military[1]= new 육군();
      
      for(int i = 0; i< military.length; i++) {
         military[i].어디소속();
         military[i].복무기간출력();
         
      }
   }
}