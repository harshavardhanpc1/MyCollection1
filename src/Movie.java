/**
 * Created by intelliswift on 4/22/18.
 */
public class Movie implements Comparable<Movie> {
    public Movie(String movie,double rating,Integer year) {
        this.movie = movie;
        this.rating = rating;
        this.year =year;
    }
    String movie;
    double rating;
    Integer year;
    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }
    public int hashCode(){
        return movie.length();
    }
    public boolean equals(Object o){
        if (! (o instanceof Movie)){
            return false;
        }
        else if(this.movie == ((Movie)o).movie ){
          return true;
        }
        return false;
    }
}
