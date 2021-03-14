
public class PineApple  extends ToppingDecorator {
	public PineApple(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Pineapple";
	}
 
	public double cost() {
		return pizza.cost() + .50; 
}
}