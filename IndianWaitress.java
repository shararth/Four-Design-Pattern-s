
public class IndianWaitress {
	IndianOrder order;
	public IndianWaitress() {}
	public void takeOrder(IndianOrder order) {
		this.order = order; 
		order.orderUp();
	}
}
