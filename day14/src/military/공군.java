package military;

public class 공군 extends 군대 {

   //어디소속()일반메서드(구현이이미 부모클래스 에서 정의)
   // 재정의를 해주건 안해주건 그건 작성자 자유

   @Override
   void 어디소속() {
      System.out.println("공군 17전투 비행단 소속");
      
   }
   //부모클래스의 추상메서드 이므로 재정의(구현)을 안해주면
   //컴파일에러(강제성)
   @Override
   void 복무기간출력() {
      System.out.println("공군은 30개월");
   }

   
    
}