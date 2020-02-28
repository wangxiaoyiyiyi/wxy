package proxy;

public class ProxyTest {

	public static void main(String[] args) {
		
		Payment pay = new AliPay(new RealPayment());
		pay.pay();
	}
}
