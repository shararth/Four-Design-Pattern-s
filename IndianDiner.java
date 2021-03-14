import java.util.ArrayList;
//import java.
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class IndianDiner implements IndianOrder {

	public static void main(String[] args) throws InterruptedException {
		
		ParathaHouse parathaHouseMenu = new ParathaHouse();
		DinerMenu dinerMenu = new DinerMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		System.out.println("                                                   WELCOME TO INDIA GATE");
		System.out.println();
		menus.add(parathaHouseMenu);
		menus.add(dinerMenu);
		Waitress waitress1 = new Waitress(menus);
		waitress1.printMenu();
		
		Pizza pizza = new ThinCrustPizza();
		System.out.println("Menu Item 24: " + pizza.getDescription() + " $" + pizza.cost());
		
		Pizza pizza1 = new ThinCrustPizza();
		Pizza CheesePizza= new Cheese(pizza1);
		Pizza GreekPizza = new Olives(CheesePizza);
		Pizza IndianPizza = new BananaPeppers(GreekPizza);

		System.out.println("The Indian Style Pizza with Thin Crust is: " + IndianPizza.getDescription() 
				+ " $" + IndianPizza.cost());
		
		System.out.println();
		
		Pizza pizza2 = new ThickCrustPizza();
		System.out.println("Menu Item 25: "+ pizza2.getDescription() + " $ " + pizza2.cost());
		
		Pizza pizza3 = new ThickCrustPizza();
		Pizza CheesePizza1 = new Cheese(pizza3);
		Pizza GreekPizza1 = new Olives(CheesePizza1);
		Pizza IndianPizza1 = new BananaPeppers(GreekPizza1);

		System.out.println("The Indian Style Pizza with Thick Crust is: " + IndianPizza1.getDescription() 
				+ " $" + IndianPizza1.cost());
		
		System.out.println();
		
		
		
		//Asking the user for  ordering how many inputs
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How many Items you want to order?");
	    int Items = myObj.nextInt();  // Read user input
	    System.out.println("You are ordering " + Items+ " Items");  // Output user input
	    System.out.println();
		
	    IndianCook cook = new IndianCook();
		IndianWaitress waitress = new IndianWaitress();
		Customer customer = new Customer(waitress);
		
	    //Asking the user for input of items
		for (int i = 0; i < Items; i++) {		
			System.out.println("Enter Menu Item Number: ");

			int item = myObj.nextInt();  // Read user input
			System.out.println("Item Number " + item + " ordered");  // Output user input
			//item= item.trim().toUpperCase();
			System.out.println();
			if(item == 1)
			{
				IndianCook.ALOOPARATHA();
			}
			if(item == 2) 
			{
				IndianCook.ONIONPARATHA();
			}
			if(item == 3) 
			{
				IndianCook.PANEERPARATHA();
			}
			if(item == 4  ) 
			{
				IndianCook.MIXEDVEGETABLEPARATHA();
			}
			if(item == 5) 
			{
				IndianCook.VEGETARIANCURRY();
			}
			if(item == 6) 
			{
				IndianCook.BINDIMASALA();
			}
			if(item == 7) 
			{
				IndianCook.CURRYOFTHEDAY();
			}
			if(item == 8) 
			{
				IndianCook.SAMOSACHAT();
			}
			if(item == 9) 
			{
				IndianCook.STEAMEDVEGIESANDBROWNRICE();
			}
			if(item == 10) 
			{
				IndianCook.CHICKEN65();
			}
			if(item == 11) 
			{
				IndianCook.CHOLEBATOORE();
			}
			if(item == 12) 
			{
				IndianCook.BHELPURI();
			}
			if(item == 13) 
			{
				IndianCook.BUTTERCHICKEN();
			}
			if(item == 14) 
			{
				IndianCook.CHICKENTIKKA();
			}
			if(item == 15) 
			{
				IndianCook.PAVBHAJI();
			}
			if(item == 16) 
			{
				IndianCook.GAJARHALWA();
			}
			if(item == 17) 
			{
				IndianCook.RASMALAI();
			}
			if(item == 18) 
			{
				IndianCook.BENGALICHUMCHUM();
			}
			if(item == 19) 
			{
				IndianCook.KAJUKATLI();
			}
			if(item == 20) 
			{
				IndianCook.MOUNTAINDEW();
			}
			if(item == 21) 
			{
				IndianCook.PEPSI();
			}
			if(item == 22) 
			{
				IndianCook.ROOTBEER();
			}
			if(item == 23) 
			{
				IndianCook.FANTA();
			}
			if(item == 24) 
			{
				IndianCook.THINCRUSTPIZZA();
			}
			if(item == 25) 
			{
				IndianCook.THICKCRUSTPIZZA();
			}
			
		}
		
		
		
		
		customer.createOrder(new ChickenCurry_Biryani_GarlicNaan (cook));
		customer.hungry();
		System.out.println("Your Indian food order is ready!");
		System.out.println();
		
		//Scanner response = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Congratulations! You have won Complementary vending machine items for yourself!");
	   
		
	    VendingMachine VendingMachine = new VendingMachine(2);
	
			System.out.println(VendingMachine);
	
			VendingMachine.insertDollar();
			VendingMachine.PressButton();
	
			System.out.println(VendingMachine);
	
			VendingMachine.insertDollar();
			VendingMachine.PressButton();
			VendingMachine.insertDollar();
			VendingMachine.PressButton();
			
			VendingMachine.refill(10);
			VendingMachine.insertDollar();
			VendingMachine.PressButton();
	
			System.out.println(VendingMachine);
		
			Scanner CardChoice = new Scanner(System.in);  
			System.out.println("Thank you for your order \n \nYou have come to the counter of Payment \n\nDo you want to pay with Debit(Enter 1) or Credit(Enter 2)");
			System.out.println();
			int card = CardChoice.nextInt();  // Read user input
		    if (card==1) {
		    	System.out.println("Insert Debit card chip or swipe");
		    	System.out.println();
		    	
		    }
		    else if(card==2) 
		    {
		    	System.out.println("Insert Credit card chip or swipe ");
		    	System.out.println();
		    }
			
		    TimeUnit.SECONDS.sleep(3);
		    
		    System.out.println("Your payment has been successfully received, please remove card!");
		    System.out.println("Thank you for dining with us. We hope you come back again! Have a wonderful day!");
			
		}
//}

	@Override
	public void orderUp() {
		// TODO Auto-generated method stub
		
	}

}
