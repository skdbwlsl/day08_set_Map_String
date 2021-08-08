

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : " + set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//it.next가 object타입이라 이걸로 받아줘야하고 문자열로 쓰고싶다면 string평변화ㅏㄴ으ㅡㄹ 해야한다
			//Object o = it.next();
			//String s = (String)o;
			String s = (String)it.next();
			System.out.println(s);
		}
	}

}


