/**
 * Created by intelliswift on 4/30/18.
 */
public class NewSingleton {
    private String name;
    private static NewSingleton st = new NewSingleton();
    private NewSingleton(){};
    public static NewSingleton creationSt(){
        return st;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
