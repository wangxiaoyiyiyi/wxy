package arithmetic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;
/**
 * ������鲻�ɱ������
 * @author ��С��
 *
 */
public class newArrays {

	public static void main(String[] args) {
		
		int[] arr = new int[]{9, 8, 7};
		System.out.println(arr);//[I@15db9742
		System.out.println(Arrays.toString(arr));//[9, 8, 7]
		int[] arrNew = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			arrNew[i] = arr[i];
		} 
		arrNew[arr.length] = 6;
		System.out.println(Arrays.toString(arrNew));
		
//		String seperator = System.getProperty("file.separator");
		String seperator = System.getProperty("file.separator");
		System.out.println(seperator);
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Random r = new Random();
		System.out.println(basePath);
		System.out.println(sDateFormat);
		System.out.println(r);
		File file = new File("C:/Users/��С��/Desktop/��.docx");
		System.out.println(file.exists());
		if(file.exists()) {
			file.mkdirs();
			System.out.println("1");
		}
		System.out.println("************************************///////");
		double floor1 = Math.random()*100;
		System.out.println(floor1);//97.82624747757845
		double floor = Math.floor(floor1);
		System.out.println(floor);//97.0
		
		System.out.println("----------------");
		System.out.println("1 \t 1");
		System.out.println("\\\\");
	}
}
