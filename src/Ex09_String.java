

public class Ex09_String {
	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		//charAt(2) �ε��� ��ȣ �ֱ� 
		System.out.println(str.charAt(2));
		
		str += "�ȳ��ϼ���";
		System.out.println(str);
		
		//���ٷ� ǥ��
		System.out.println();
		
		//���ڿ� ��°�δ� equals�� ���ϰ� "" �� ��
		System.out.println(str.equals("abcdefg�ȳ��ϼ���"));
		System.out.println(str==("abcdefg�ȳ��ϼ���"));
		
		//���� �ϳ� ��''�� ��
		System.out.println(str.charAt(0)=='a');
		System.out.println(str.charAt(0)=='d');
		
		
		System.out.println(str.charAt(0)-32);
		//����� ĳ���͸� char�� ��ȯ�ض�
		System.out.println((char)(str.charAt(0)-32));
	}

}
