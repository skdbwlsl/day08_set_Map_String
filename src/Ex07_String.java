

import java.util.Scanner;

public class Ex07_String {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//String str; 이것도 가능
		//이렇게도 가능 
		String str = new String();
		
		System.out.println("문자열 입력 ");
	str = input.next();
	System.out.println("입력 받은 문자열 : "+str);
	}

}
