

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		//����ڷκ��� �Է¹ޱ�
		
	
		Scanner input = new Scanner(System.in);
		//<�ڷ� Ÿ��, Ÿ��>
		HashMap map= new HashMap();
		String key = null,value = null;
		System.out.println("������ Ű �Է� : ");
		key = input.next();
		System.out.println("������ �� �Է� : ");
		value = input.next();
		
		map.put(key,value);
		
		System.out.println(map);
	}

}
