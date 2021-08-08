

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex04_Map {
	public static void main(String[] args) {
		/*
		 Map
		 -HashMap
		 -TreeMap
		 -HashTable ...등등
		 HashMap 
		 -키와 값이 쌍이다 
		 -순서는 유지되지 않는다
		 -키에 대한 중복은 허용하지 않는다
		 */
		//LinkdeHashMap map = new HashMap();이렇게 하면 순서 유지
		HashMap map = new HashMap();
		map.put("선풍기", "1000만원");
		map.put("자동차", "10만원");
		map.put("에어컨", "30만원");
		
		System.out.println(map);
		
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("자동차"));
		System.out.println(map.get("에어컨"));
		System.out.println(map.get("없는키"));
		
		//해당키가 있나 물어봄
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map.containsKey("에어컨111"));
		
		System.out.println(map.containsKey("30만원"));
		System.out.println(map.containsKey("31만원"));
		
		System.out.println(map.remove("에어컨"));
		System.out.println(map.containsKey("에어컨"));
				System.out.println(map);
		
		//값을 하나씩 꺼내와야한다
		System.out.println(map.keySet());
		
		//Set s = map.keySet();
		//Iterator it = s.iterator();
		//이렇게 해야 키와 값을 따로따로 사용할 수 있다
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+":"+ map.get(key));
		}
	}

}
