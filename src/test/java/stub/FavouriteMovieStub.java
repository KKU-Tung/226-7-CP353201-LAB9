package stub;

import java.util.Arrays;
import java.util.List;

import api.MovieService;

public class FavouriteMovieStub {
	
	public List<String> getMovie(String playlist, String movieName) {
		return Arrays.asList("The Notebook, 50 First Dates", "Walk to Remember", "First Love", "The Lucky One");
}
}
