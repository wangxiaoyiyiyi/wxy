package proxy;

public class RealPayment implements Payment{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("我只关心支付功能");
	}

}
