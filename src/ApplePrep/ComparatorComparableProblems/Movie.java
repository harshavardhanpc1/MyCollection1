package ApplePrep.ComparatorComparableProblems;

/**
 * Created by intelliswift on 1/21/19.
 */
public class Movie implements Comparable<Movie> {
    int id;
    String name;
    public Movie(int id,String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Movie o) {
           return (this.id - o.id);
    }

    public boolean equals(Object obj)
    {
        Movie other = (Movie) obj;
        if (this.name.equals(other.name))
        {
            return true;
        }
        else
        return false;
    }
    public int hashCode(){
        return id;
    }
}
