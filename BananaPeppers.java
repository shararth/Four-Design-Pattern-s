
public class BananaPeppers extends ToppingDecorator {
	public BananaPeppers(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Banana Peppers";
	}
 
	public double cost() {
		return pizza.cost() + .50; 
}
}
