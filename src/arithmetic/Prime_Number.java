package arithmetic;
/**
 * 1-100 ����֮��
 * @author ��С��
 *
 */
public class Prime_Number {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=2;i<=100;i++) { //i��2��ʼ
			boolean flag = true;
			for(int j=2;j<i;j++) { //j��<i,����<=i����Ȼ���������
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
