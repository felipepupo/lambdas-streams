package functions.consumer_function;

public class Movie {
    String movieName;
    String director;
    public Movie(String movieName, String director) {
        this.movieName = movieName;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie[" +
                "movieName='" + movieName + '\'' +
                ']';
    }
}
