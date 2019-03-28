package PracticePackage;

/**
 * Created by intelliswift on 7/28/18.
 */
public class Movies implements Comparable<Movies> {
    public Movies(String name,int rating){
        this.name = name;
        this.rating = rating;
    }
    public String name;
    public int rating;

    @Override
    public int compareTo(Movies o) {
        return o.rating-this.rating;
    }
    public int hashCode(){
        return rating;
    }
    public boolean equals(Object O){
        if(!(O instanceof Movies) )
            return false;
        else if (this.name == (((Movies)O).name)){
            return true;}
        else
            return false;
        }
    }
