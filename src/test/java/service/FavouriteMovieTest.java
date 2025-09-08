//นาย ภคพล อยู่ยืน 663380226-7
package service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import api.MovieService;
import stub.FavouriteMovieStub;

class FavouriteMovieTest {

	@Test
	void testwStub() {
		MovieService movieservice = new FavouriteMovieStub();
		FavouriteMovie favouritemovie = new FavouriteMovie(movieservice);
		
		List<String> movielist = favouritemovie.getMovie("action","Pakapol");
		assertEquals(3, movielist.size());
	}

}
