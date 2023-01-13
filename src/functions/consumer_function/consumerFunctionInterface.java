package functions.consumer_function;

import java.util.function.Consumer;

public class consumerFunctionInterface {

    Consumer<Movie> printInfo = m -> System.out.println("Movie: " + m);
    Consumer<Movie> persistMovie = m -> persist(String.valueOf(m));
    private void testConsumer(Movie movie){
        printInfo.accept(movie);
        persistMovie.accept(movie);
    }

    public void testAndThen(Movie movie){
        Consumer<Movie> printAndPersistMovie = persistMovie.andThen(printInfo);
        printAndPersistMovie.accept(movie);
    }

    private void persist (String m){
        System.out.println("Persisting movie: " + m);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Gods Must Be Crazy");
        new consumerFunctionInterface().testConsumer(movie);
        new consumerFunctionInterface().testAndThen(movie);
    }
}
