package FacePrep;



/**
 * Created by intelliswift on 1/29/19.
 */




public class StringImpl {
        public static void main(String[] args) {
            TextInput input = new NumericInput();
            TextInput input1 = new TextInput();
            input.add('1');
            input.add('a');
            input.add('0');
            input1.add('1');
            input1.add('a');
            input1.add('0');
            System.out.println(input.getString());
            System.out.println(input1.getString());

        }
}
