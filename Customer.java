
public class Customer {
	IndianWaitress waitress;
	IndianOrder order;
	public Customer(IndianWaitress waitress) {
		this.waitress = waitress;
	}
	public void createOrder(IndianOrder order) {
		this.order = order;
	}
	public void hungry() {
		waitress.takeOrder(order);
	}

}
