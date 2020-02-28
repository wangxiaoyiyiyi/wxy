package arithmetic;

import java.util.Scanner;
import java.util.UUID;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = sc.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println("是闰年");
		}else {
			System.out.println("不是闰年");
		}
		
		int length = UUID.randomUUID().toString().length();
		System.out.println(length);
	}

}
