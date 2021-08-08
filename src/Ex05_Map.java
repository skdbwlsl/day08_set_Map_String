

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		//사용자로부터 입력받기
		
	
		Scanner input = new Scanner(System.in);
		//<자료 타입, 타입>
		HashMap map= new HashMap();
		String key = null,value = null;
		System.out.println("저장할 키 입력 : ");
		key = input.next();
		System.out.println("저장할 값 입력 : ");
		value = input.next();
		
		map.put(key,value);
		
		System.out.println(map);
	}

}
