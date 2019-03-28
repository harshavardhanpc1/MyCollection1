package PracticePackage;

import java.io.*;

/**
 * Created by intelliswift on 7/30/18.
 */
public class ReadingFile {
    public static void main(String[]args) throws FileNotFoundException {
        String filename = "/tmp/this.txt";
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(filename);

            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while (dis.available() != 0) {
                System.out.println(dis.readLine());
            }

            fis.close();
            bis.close();
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        }
}
