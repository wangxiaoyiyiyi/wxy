package arithmetic;
/**
 * 1-100 质数之和
 * @author 王小艺
 *
 */
public class Prime_Number {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=2;i<=100;i++) { //i从2开始
			boolean flag = true;
			for(int j=2;j<i;j++) { //j是<i,不是<=i，不然结果就是零
				if(i%j==0) {
					flag = false;
				}
			}
			if(flag) {
				sum += i; 
			}
		}
		System.out.println(sum);
		
		String s ="abcdefg";
		String a = s.substring(2,3);
		System.out.println(a);
	}
}
