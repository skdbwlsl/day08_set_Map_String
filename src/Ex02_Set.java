

import java.util.ArrayList;
import java.util.Iterator;


public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		
		//arrayList�� ǥ��
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		//�ݺ������ε� ���氡��
				Iterator it = arr.iterator();
				while(it.hasNext()==true) {
					System.out.println(it.next());
				}
		}
		//�ݺ���iterator
		/*
		Iterator it = arr.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		//hashNext : ���� ���� �ִ���(���� ���� ����������) �����
			//	�������� �ִ��� ��� �Ѿ ������ ���� ������ true�� ���
	}  //next : ���� ���� �����´�
		
		//hasNext�� next�� �����Ͱ� ������ ��� ����Ѵ�
	*/
	
		
}
