
public class InvalidPizzaSizeException extends Exception {
	
		public InvalidPizzaSizeException() {}
		
		public String toString() {
			return "Pizza Size Invalid only small and medium size pizzas are allowed";
		}

}
