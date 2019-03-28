import java.util.regex.Pattern;

/**
 * Created by intelliswift on 4/25/18.
 */
public class NewPattern {
    public static void main(String [] args) {
        String s = "thisismatchthisacanthis1";
        String pattern = "^[a-z]+";
       //    String s = "1234";
        //   String pattern = "^[0-9]+";
        String pattern1 = "^[a-z]+[0-9]+";
      boolean isMatch = Pattern.matches(pattern1,s);
        System.out.println(isMatch);
    }
}
