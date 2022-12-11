package functions.consumer_function;

public class Movie {
    String movieName;
    public Movie(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movie[" +
                "movieName='" + movieName + '\'' +
                ']';
    }
}
