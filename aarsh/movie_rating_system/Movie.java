package aarsh.movie_rating_system;

/*
 * A movie rating system is a way to rate movies based on their content, quality, and other factors. This system is used by movie enthusiasts, critics, and movie-goers to provide an overall rating of a movie. Here is a possible implementation of a movie rating system using Comparable and Comparator in Java:
 * Create a Movie class with fields for title, year, and rating. Implement the Comparable interface and override the compareTo() method to compare movies based on their ratings.
 * Create a RatingComparator class that implements the Comparator interface and overrides the compare() method to compare movies based on their ratings.
 * Create a Main class that has a main method to test the movie rating system. In the main method, create a list of movies and sort the list using Collections.sort() method with the RatingComparator.
 * The main method should also have the ability to display the list of movies sorted by title, year, and rating. To sort the list by title, use Collections.sort() method with the Comparable interface in the Movie class. To sort the list by year, create a YearComparator class that implements the Comparator interface and overrides the compare() method to compare movies based on their year of release.
 * Finally, the main method should have the ability to display the movie with the highest and lowest rating, which can be done by using the Collections.max() and Collections.min() methods.
 */
public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private double rating;

    
    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie other) {
        if (this.rating < other.rating)
            return -1;
        else if (this.rating > other.rating)
            return 1;
        else
            return 0;
    }


    // Create a similar class called as Car.java
    // Create a class called as CarComparator.java and implement the comparable interface
    // String name; int yearOfManufacture; int price;
    // sort by price using comparable interface

    // Create a class called as CarComparator.java and implement the comparator interface
    // String name; int yearOfManufacture; int price;
    // sort by price, yearOfManufacture, name using comparator interface
    // before 12:00 AM  at the end of 2nd Feb ----- 03/02/2023 
}
