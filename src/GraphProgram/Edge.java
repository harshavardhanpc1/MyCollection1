package GraphProgram;

/**
 * Created by intelliswift on 5/2/18.
 */
public class Edge {
        private Vertex one, two;
    public Edge(Vertex one, Vertex two){
            this.one = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two;
            this.two = (this.one == one) ? two : one;

        }
        public Edge(Vertex one, Vertex two, int weight){
            this.one = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two;
            this.two = (this.one == one) ? two : one;
        }
        public Vertex getNeighbor(Vertex current){
            if(!(current.equals(one) || current.equals(two))){
                return null;
            }
            return (current.equals(one)) ? two : one;
        }

        public Vertex getOne(){
            return this.one;
        }

        public Vertex getTwo(){
            return this.two;
        }

    public String toString(){
        return "({" + one + ", " + two + "})";
    }

    public int hashCode(){
        return (one.getLabel() + two.getLabel()).hashCode();
    }

    public boolean equals(Object other){
        if(!(other instanceof Edge)){
            return false;
        }

        Edge e = (Edge)other;
        return e.one.equals(this.one) && e.two.equals(this.two);
    }


}
