public class SoldOutState implements State {
    VendingMachine vendingMachine;
 
    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
 
	public void insertDollar() {
		System.out.println("You can't insert a dollar, the machine is sold out");
	}
 
	public void ejectDollar() {
		System.out.println("You can't eject, you haven't inserted a dollar yet");
	}
 
	public void pressButton() {
		System.out.println("You Pressed button, but there are no Items");
	}
 
	public void dispense() {
		System.out.println("No Item dispensed");
	}
	
	public void refill() { 
		vendingMachine.setState(vendingMachine.getNoDollarState());
	}
 
	public String toString() {
		return "sold out";
	}
}