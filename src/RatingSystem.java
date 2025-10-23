import java.util.HashSet;

public class RatingSystem {
	HashSet<Customer> ratings = new HashSet<Customer>();
	
	public void addRating(Customer customer) {
		ratings.add(customer);
	}
	
	public void displayRatings() {
		for (Customer c : ratings) {
			System.out.println(c.movieTitle + ": " + c.rating);
		}
	}

}
