package PracticePackage;

/**
 * Created by intelliswift on 8/11/18.
 */
public class LoopsPrograms {
    public static void main(String[]args){
        int i = 0;
        int j = 3;

        do{

            if(i%2==0){
                i++;
                continue;
            }
          for(int k=1;k <= j;k++) {
              if (k % 2 == 0) {
                  break;
              }
              System.out.print(k + " K " + i + " IDONE ");
          }
            System.out.println();
            i++;
          }while(i<10);

    }
}
