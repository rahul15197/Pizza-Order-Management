import java.util.Scanner;

public class Delivery {
	
	static void checkType(String type) throws InvalidPizzaTypeException {
		if(!(type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("non-veg"))) {
			throw new InvalidPizzaTypeException();
		}
	}
	
	static void checkSize(String size) throws InvalidPizzaSizeException {
		if(!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium"))) {
			throw new InvalidPizzaSizeException();
		}
	}
	
	public static void main(String args[])
	{
		final int veg_small=200;
		final int veg_medium=350;
		
		final int nonveg_small=270;
		final int nonveg_medium=420;
		
		final int added_topping=30;
		String more;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to PizzaHut menu:");
		do {
		System.out.println("Italian Pizza or Mexican Pizza?");
		String name=sc.next();
		System.out.println("Enter Type of Pizza [veg/non-veg]:");
		String type=sc.next();
		
		System.out.println("Do you want added toppings in Pizza[yes/no]:");
		String ch=sc.next();
		
		System.out.println("Enter Size of Pizza [small/medium]:");
		String size=sc.next();
		
		try {
			checkSize(size);
		} catch (InvalidPizzaSizeException e) {
			System.out.println(e);
		}
		
		try {
			checkType(type);
		} catch (InvalidPizzaTypeException e) {
			System.out.println(e);
		}
		
		if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("yes"))
		{
			ItalianPizza ip=new ItalianPizza(type,"Mushroom","Italian Pizza",10.0f,(veg_small+added_topping),size);
			System.out.println(ip);
		}
			
		else if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("no"))
		{
			ItalianPizza ip=new ItalianPizza(type,ch,"Italian Pizza",10.0f,veg_small,size);
			System.out.println(ip);
		}
		else if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("yes"))
		{
			ItalianPizza ip1=new ItalianPizza(type,"Mushroom","Italian Pizza",10.0f,(veg_medium+added_topping),size);
			System.out.println(ip1);
		}
		else if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("no"))
		{
			ItalianPizza ip1=new ItalianPizza(type,ch,"Italian Pizza",10.0f,veg_medium,size);
			System.out.println(ip1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("yes"))
		{
			ItalianPizza ip1=new ItalianPizza(type,"Pepperoni","Italian Pizza",10.0f,(nonveg_small+added_topping),size);
			System.out.println(ip1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("no"))
		{
			ItalianPizza ip1=new ItalianPizza(type,ch,"Italian Pizza",10.0f,nonveg_small,size);
			System.out.println(ip1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("yes"))
		{
			ItalianPizza ip1=new ItalianPizza(type,"Pepperoni","Italian Pizza",10.0f,(nonveg_medium+added_topping),size);
			System.out.println(ip1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("italian")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("no"))
		{
			ItalianPizza ip1=new ItalianPizza(type,ch,"Italian Pizza",10.0f,nonveg_medium,size);
			System.out.println(ip1);
		}
			
			
			
		else if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("yes"))
		{
			MexicanPizza mp=new MexicanPizza(type,"Onion","Mexican Pizza",15.0f,(veg_small+added_topping),size);
			System.out.println(mp);
		}
			
		else if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("no"))
		{
			MexicanPizza mp=new MexicanPizza(type,ch,"Mexican Pizza",15.0f,veg_small,size);
			System.out.println(mp);
		}
		else if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("yes"))
		{
			MexicanPizza mp1=new MexicanPizza(type,"Onion","Mexican Pizza",15.0f,(veg_medium+added_topping),size);
			System.out.println(mp1);
		}
		else if(type.equalsIgnoreCase("veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("no"))
		{
			MexicanPizza mp1=new MexicanPizza(type,ch,"Mexican Pizza",15.0f,veg_medium,size);
			System.out.println(mp1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("yes"))
		{
			MexicanPizza mp1=new MexicanPizza(type,"Chicken","Mexican Pizza",15.0f,(nonveg_small+added_topping),size);
			System.out.println(mp1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("small")&&ch.equalsIgnoreCase("no"))
		{
			MexicanPizza mp1=new MexicanPizza(type,ch,"Mexican Pizza",15.0f,nonveg_small,size);
			System.out.println(mp1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("yes"))
		{
			MexicanPizza mp1=new MexicanPizza(type,"Chicken","Mexican Pizza",15.0f,(nonveg_medium+added_topping),size);
			System.out.println(mp1);
		}
		else if(type.equalsIgnoreCase("non-veg")&&name.equalsIgnoreCase("mexican")&&size.equalsIgnoreCase("medium")&&ch.equalsIgnoreCase("no"))
		{
			MexicanPizza mp1=new MexicanPizza(type,ch,"Mexican Pizza",15.0f,nonveg_medium,size);
			System.out.println(mp1);
		}
		System.out.println("Order more pizzas??");
		more = sc.next();
	}while(more.equalsIgnoreCase("yes") || more.equalsIgnoreCase("yeah"));
		

}
}
