package FacePrep;

/**
 * Created by intelliswift on 1/29/19.
 */
public class TextInput {
    String s = null;
    public void add(char c){
        if(s == null){
            s = Character.toString(c);
        }
        else
            s = s + Character.toString(c);
    }
    public String getString(){
        return this.s;
    }
}
