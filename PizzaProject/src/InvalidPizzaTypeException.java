

public class InvalidPizzaTypeException extends Exception {

	public InvalidPizzaTypeException() {}
	
	public String toString() {
		return "Pizza Type Invalid only Veg and Non-Veg Pizzas are available";
	}
}
