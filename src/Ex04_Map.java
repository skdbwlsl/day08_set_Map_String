

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex04_Map {
	public static void main(String[] args) {
		/*
		 Map
		 -HashMap
		 -TreeMap
		 -HashTable ...���
		 HashMap 
		 -Ű�� ���� ���̴� 
		 -������ �������� �ʴ´�
		 -Ű�� ���� �ߺ��� ������� �ʴ´�
		 */
		//LinkdeHashMap map = new HashMap();�̷��� �ϸ� ���� ����
		HashMap map = new HashMap();
		map.put("��ǳ��", "1000����");
		map.put("�ڵ���", "10����");
		map.put("������", "30����");
		
		System.out.println(map);
		
		System.out.println(map.get("��ǳ��"));
		System.out.println(map.get("�ڵ���"));
		System.out.println(map.get("������"));
		System.out.println(map.get("����Ű"));
		
		//�ش�Ű�� �ֳ� ���
		System.out.println(map.containsKey("������"));
		System.out.println(map.containsKey("������111"));
		
		System.out.println(map.containsKey("30����"));
		System.out.println(map.containsKey("31����"));
		
		System.out.println(map.remove("������"));
		System.out.println(map.containsKey("������"));
				System.out.println(map);
		
		//���� �ϳ��� �����;��Ѵ�
		System.out.println(map.keySet());
		
		//Set s = map.keySet();
		//Iterator it = s.iterator();
		//�̷��� �ؾ� Ű�� ���� ���ε��� ����� �� �ִ�
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+":"+ map.get(key));
		}
	}

}
