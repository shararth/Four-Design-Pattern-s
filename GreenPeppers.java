
public class GreenPeppers  extends ToppingDecorator {
	public GreenPeppers(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Green Peppers";
	}
 
	public double cost() {
		return pizza.cost() + .50; 
}
}
