package day08;
//[배열복사]
public class ArrayCopyExamlple {
	public static void main (String args[]) {
		
		//--배열복사가 없을때
		int a[]= {1,2};
		int b[]= a;
		
		b[1]=100;
		System.out.println("a[1]= "+ a[1]);
	
		//-- 1. for문을 활용한 복사
		
		int a1[]= {1,2};
		int b1[]= new int[a1.length];
		
		for (int x =0;x < a1.length; x ++) {
			b1[x] = a1[x];
			
		}
		
		b1[1] = -1000;
		System.out.println("a1[1]= " +a1[1]);
		
		//--2. System.arrayCopy
		int a2[] = {1,2,3};
		int b2[]= new int[3]; 
	    System.arraycopy(a2, 1, b2,0, a2.length-1);
	    
	    System.out.println("arrayCopy 로 복사");
	    for(int x = 0; x < b2.length; x++) {
	    	System.out.println (b2[x]);
	    }
	    
	    //--향상된 for문
	    System.out.println("향상된 for문 을 사용하여 배열 꺼내기");
	    //for each 문
	    
	    //성능은 for문 (full) 이 더 좋다
	    for(int val : b2) {
	    	System.out.println(val);
	    	
		}
	}
}

