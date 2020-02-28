package proxy;

public class AliPay implements Payment{
	//AliPay代替payment做一些事情
	Payment payment;
	
	
	
	public AliPay(Payment payment) {
		this.payment = payment;
	}

	public void beforePay() {
		System.out.println("从银行取款");
	}
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		beforePay();
		payment.pay();
		afterPay();
	}
	public void afterPay() {
		System.out.println("支付给....");
	}
}
