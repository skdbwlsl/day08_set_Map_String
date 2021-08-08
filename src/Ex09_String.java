

public class Ex09_String {
	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		//charAt(2) 인덱스 번호 넣기 
		System.out.println(str.charAt(2));
		
		str += "안녕하세요";
		System.out.println(str);
		
		//한줄로 표시
		System.out.println();
		
		//문자열 통째로는 equalsㄹ 비교하고 "" 로 비교
		System.out.println(str.equals("abcdefg안녕하세요"));
		System.out.println(str==("abcdefg안녕하세요"));
		
		//문자 하나 비교''로 비교
		System.out.println(str.charAt(0)=='a');
		System.out.println(str.charAt(0)=='d');
		
		
		System.out.println(str.charAt(0)-32);
		//연산된 캐릭터를 char로 변환해라
		System.out.println((char)(str.charAt(0)-32));
	}

}
