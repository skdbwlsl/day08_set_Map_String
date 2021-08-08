

import java.util.ArrayList;
import java.util.Iterator;


public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		
		//arrayList로 표현
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		//반복문으로도 변경가능
				Iterator it = arr.iterator();
				while(it.hasNext()==true) {
					System.out.println(it.next());
				}
		}
		//반복자iterator
		/*
		Iterator it = arr.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		//hashNext : 다음 값이 있는지(다음 값이 데이터인지) 물어본다
			//	다음값이 있는지 계속 넘어갈 때마다 답이 있으면 true로 출력
	}  //next : 다음 값을 가져온다
		
		//hasNext와 next는 데이터가 있으면 계속 써야한다
	*/
	
		
}
