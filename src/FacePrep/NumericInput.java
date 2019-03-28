package FacePrep;

import java.util.regex.Pattern;

/**
 * Created by intelliswift on 1/29/19.
 */
public class NumericInput extends TextInput {
    public void add(char c){
        String pattern = "^[0-9]+";
        if(s == null && Pattern.matches(pattern,Character.toString(c))){
            s = Character.toString(c);
        }
        else if(Pattern.matches(pattern,Character.toString(c)))
            s = s + Character.toString(c);
    }
    public String getString(){
        return this.s;
    }
}
