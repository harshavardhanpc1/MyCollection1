import java.util.*;

/**
 * Created by intelliswift on 4/22/18.
 */
public class ListMovie {
    public static void main(String [] args){
        List<Movie> movies = new ArrayList<Movie>();
        Set<Movie> movieset = new HashSet<Movie>();
        movies.add(new Movie("Terminator", 8.59 ,2000));
        movies.add(new Movie("Terminator", 8.59 ,2000));
        movies.add(new Movie("Jurrasic Park", 8.20 ,1993));
        movies.add(new Movie("Independence Day", 8.01 ,1997));
        movieset.addAll(movies);
        Collections.sort(movies);
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(movies,ratingCompare);
        for (Movie o : movies)
            System.out.println(o.movie + " " + o.rating + " " + o.year);

        Iterator it = movieset.iterator();
        while(it.hasNext()) {
            Movie movie1 = (Movie) it.next();
            System.out.println("This set " + movie1.movie + " " + movie1.rating + movie1.year);
        }

    }
}
