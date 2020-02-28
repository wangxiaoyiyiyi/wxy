package mianshi;
/**
 * 99乘法表
 * @author 王小艺
 *
 */
public class MianShi {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=10-i; j++) {
				sum = i * j;
				System.out.print(i+"*"+j+"="+sum+"\t");
			}
			System.out.println();
		}
		
	}
}
