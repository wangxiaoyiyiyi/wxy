package arithmetic;

import java.util.Arrays;

/**
 * ɾ��������ָ����Ԫ��
 * @author ��С��
 *
 */

public class RemoveArrays {

	public static void main(String[] args) {
		
		int[] arr = new int[] {0,1,2,3,4};
		
		int[] arrNew = new int[arr.length-1];
		
		int rm = 3;
		for(int i=0; i<arrNew.length; i++) {
			if(i<rm) {
				arrNew[i] = arr[i];
			}else {
				arrNew[i] = arr[i+1];
			}
		}
		arr= arrNew;
		System.out.println(Arrays.toString(arrNew));
	}
}
