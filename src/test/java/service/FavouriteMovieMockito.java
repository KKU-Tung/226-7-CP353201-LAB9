//นาย ภคพล อยู่ยืน 663380226-7
package service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import api.MovieService;

class FavouriteMovieMockito {

	@Test
		void testwMockito() {
			MovieService movieservice = mock(MovieService.class);
		List<String> movielist = Arrays.asList("[datenight] The Notebook","[datenight] 50 First Dates",
					"[datenight] Walk to Remember", "[datenight] First Love", 
					"[datenight] The Lucky One", "[action] The Fall Guy",
					"[action] The Batman", "[action] Superman",
					"[horror] IT","[horror] Annabelle",
					"[horror] The Nun"
					);
		
		when(movieservice.getMovie("action","Pakapol")).thenReturn(movielist);

		FavouriteMovie favouritemovie = new FavouriteMovie(movieservice);
		List<String> actionMovies = favouritemovie.getMovie("action","Pakapol");

		assertEquals(3, actionMovies.size());  
		
	}
}
