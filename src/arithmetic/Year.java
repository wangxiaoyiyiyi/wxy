package arithmetic;

import java.util.Scanner;
import java.util.UUID;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���������");
		int year = sc.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
		
		int length = UUID.randomUUID().toString().length();
		System.out.println(length);
	}

}
