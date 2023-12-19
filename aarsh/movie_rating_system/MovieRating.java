package aarsh.movie_rating_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieRating {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 1994, 9.2));
        movies.add(new Movie("The Godfather", 1972, 9.2));
        movies.add(new Movie("The Dark Knight", 2008, 9.0));
        movies.add(new Movie("The Godfather: Part II", 1974, 9.0));
        movies.add(new Movie("The Lord of the Rings: The Return of the King", 2003, 8.9));
        movies.add(new Movie("Pulp Fiction", 1994, 8.9));

        System.out.println("Original List:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " ------ " + movie.getRating() + " ------ " + movie.getYear());
        }
        // points to remember
        // original collection is also modified. 
        Collections.sort(movies); // This will sort according to the compare to method implemented in Movie class

        System.out.println("\nSorted List:");

        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " ------ " + movie.getRating() + " ------ " + movie.getYear());
        }

        // your task is to sort in descending order. 
    }
}
