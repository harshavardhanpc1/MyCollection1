package ApplePrep.ComparatorComparableProblems;

import java.util.Comparator;

/**
 * Created by intelliswift on 1/21/19.
 */
public class MovieNameSort implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return (o1.name.compareTo(o2.name));
    }
}
