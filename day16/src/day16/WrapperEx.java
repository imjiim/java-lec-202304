package day16;

public class WrapperEx{
	public static void main (String args[]) {
	 Integer i1 = new Integer(10);//명시적으로 Boxing(deprecated)
	 Integer i2 = Integer.valueOf(10);//명시적 Boxing
	 Integer i3 = Integer.valueOf("100");//명시적 Boxing
	 
	 Integer i4 = 10;
	 Integer i5 = new Integer(10);
	 Integer i6 = 10;
	 
	 
	 //wrapping class 클래스 사용시 == 아닌 equals() 비교하세요
	 System.out.println("i1==i5" +(i1==i5));
	 System.out.println("i4==i6" +(i4==i6));
	 System.out.println(i3.equals(10));
	 
	 //wrapping class 의 상수들 
	 System.out.println("Short의 범위 : ");
	 System.out.println(Short.MIN_VALUE + "~" +Short.MAX_VALUE);
	 
	 Double db = Double.valueOf("1.9999");
	 
	 System.out.println("i6+10=" + (i6+ 10)); // auto unboxing
	 
	System.out.println(i1);
	
}
	
}
