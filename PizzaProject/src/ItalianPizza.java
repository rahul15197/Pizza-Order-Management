
public class ItalianPizza extends Pizza{
	
	public ItalianPizza(String type, String toppings, String name, float timeForPreparation, int costOfPizza,
			String size) {
		super(type, toppings, name, timeForPreparation, costOfPizza, size);
	}
	
	




	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		int total_cost=0;
		total_cost+=costOfPizza;
		return total_cost;
	}

	@Override
	public String toString() {
		return "ItalianPizza : " + type + " " + name + " with " + toppings + " toppings " + " which take " +
				+ timeForPreparation + " min for preparation." + "\nTotal Cost is " + calculateCost();
	}
	

}
