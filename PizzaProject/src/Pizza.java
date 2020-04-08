
abstract public class Pizza {
	String type;
	String toppings;
	String name;
	float timeForPreparation;
	int costOfPizza;
	String size;
	
	public Pizza() {
		super();
	}
	public Pizza(String type, String toppings, String name, float timeForPreparation, int costOfPizza, String size) {
		super();
		this.type = type;
		this.toppings = toppings;
		this.name = name;
		this.timeForPreparation = timeForPreparation;
		this.costOfPizza = costOfPizza;
		this.size = size;
	}
	
	public int getCostOfPizza() {
		return costOfPizza;
	}
	public void setCostOfPizza(int costOfPizza) {
		this.costOfPizza = costOfPizza;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTimeForPreparation() {
		return timeForPreparation;
	}
	public void setTimeForPreparation(float timeForPreparation) {
		this.timeForPreparation = timeForPreparation;
	}
	
	abstract public int calculateCost();
	
	@Override
	public String toString() {
		return "Pizza : " + type + "," + toppings + "," + name + ", timeForPreparation : "
				+ timeForPreparation;
	}
	

}
