

import java.util.ArrayList;
import java.util.HashSet;

//그렇게 많이 사용하는 것은 아님
public class Ex01_Set {
	public static void main(String[] args) {
		/*
		 Set
		 -HashSet
		 -TreeSet..등
		 HashSet
		 -순서 유지가 안된다(index로 가지고 올 수 없다)
		 -데이터의 중복을 허용하지 않는다
		 */
		HashSet hs = new HashSet();
		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥");
		
		System.out.println("hs : " + hs);
		//remove
		hs.remove("김밥");
		System.out.println("hs : " + hs);
		
		ArrayList arr = new ArrayList();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("김밥");
		System.out.println("arr : " + arr);
		
		
	}

}
