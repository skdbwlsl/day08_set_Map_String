package day08_set_Map_String;

import java.util.ArrayList;

public class quiz03 {
	public static void main(String[] args) {
		// 1��
				String str = new String("Have a nice day Have a nice day Have a nice day");
				int i=0;
				ArrayList arr = new ArrayList();
				while(i < str.length()) {
					if(str.charAt(i) == 'a')
						arr.add(i);
					i++;
				}
				System.out.println(arr);
				
				// 2��
				String str01 = new String("It is a fun java programming");
				int j=0;
				int cnt_a=0,cnt_g=0,cnt=0;
				while(j < str01.length()) {
					if(str01.charAt(j) == 'a')
						cnt_a++;
					else if(str01.charAt(j) == 'g')
						cnt_g++;
					j++;
				}
				System.out.println("�� ���� : "+str01.length());
				System.out.println("a ���� : "+cnt_a);
				System.out.println("g ���� : "+cnt_g);
				
				// 3��
				String str02 = new String("tESt  sTring  change   first");
				String changeStr = new String();
				int k=0;

				str02 = str02.toLowerCase();
				if(str02.charAt(0) >='a' && str02.charAt(0) <='z') {
					changeStr+=(char)(str02.charAt(k)-32);
					k++;
				}
				while(k<str02.length()) {
					if(str02.charAt(k) != ' ') {
						changeStr+=str02.charAt(k);
						k++;
						continue;
					}
					while(str02.charAt(k) == ' ') {
						changeStr+=str02.charAt(k);
						k++;
					}
					if(str02.charAt(k) >= 'a' &&str02.charAt(k) <='z')
						changeStr+=(char)(str02.charAt(k)-32);
					k++;
				}
				System.out.println(str02);
				System.out.println(changeStr);
				System.out.println("����");
			}

		

	}
