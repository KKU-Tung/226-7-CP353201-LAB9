package service;

import java.util.ArrayList;
import java.util.List;

import api.MovieService;

public class FavouriteMovie {
		
		private MovieService movieservice;
		
		public FavouriteMovie(MovieService movieservice) {
			super();
			this.movieservice = movieservice;
		}
		
		//get only books relative to the keyword in the catalog of a certain month
		public List<String> getMovie(String playlist, String movieName) {
			List<String> movieplayList = new ArrayList<String>();
			List<String> allmovieList = movieservice.getMovie(playlist, movieName);
				
			for (String movie: allmovieList) {
				if (movie.contains(movieName)) {
					movieplayList.add(movie);
				}
			}
			return movieplayList;
		}
}