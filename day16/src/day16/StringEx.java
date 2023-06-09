package day16;

public class StringEx {
	
	public static void main (String args[]) {
		
		String str1 = "임지영";
		String str2 = "만세";
		System.out.println("str1 = " + System.identityHashCode(str1));
		str1 =str1+ str2 +" 예이예이예";
		System.out.println("str1 =" + System.identityHashCode(str1));
		System.out.println(str1);
		
		StringBuffer str3 = new StringBuffer("임지영");
		System.out.println("str3=" +System.identityHashCode(str3));
		
		str3.append(str2).append(" 후추후추");
		
		
		System.out.println("str3=" +System.identityHashCode(str3));
		System.out.println(str3);
		System.out.println("str1==str3" +(str1.equals(str3)));
	}

}
