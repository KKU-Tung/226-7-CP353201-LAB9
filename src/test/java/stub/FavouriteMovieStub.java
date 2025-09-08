//นาย ภคพล อยู่ยืน 663380226-7 
package stub;

import java.util.Arrays;
import java.util.List;

import api.MovieService;

public class FavouriteMovieStub implements MovieService{
	@Override
	public List<String> getMovie(String playlist, String movieName) {
		return Arrays.asList("[datenight] The Notebook","[datenight] 50 First Dates",
				"[datenight] Walk to Remember", "[datenight] First Love", 
				"[datenight] The Lucky One", "[action] The Fall Guy",
				"[action] The Batman", "[action] Superman",
				"[horror] IT","[horror] Annabelle",
				"[horror] The Nun"
				);
	}
}
