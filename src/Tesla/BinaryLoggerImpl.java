package Tesla;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by intelliswift on 7/29/18.
 */
public class BinaryLoggerImpl<E> implements BinaryLogger {
   private String filename;
   private long  maxsize;
     public BinaryLoggerImpl(String filename,long maxsize){
         this.filename = filename;
         this.maxsize = maxsize;
     }
    @Override
    public void write(BinaryLoggable loggable) throws IOException {
        byte [] fileAsByteArray = loggable.toBytes(loggable);
         FileOutputStream fos = new FileOutputStream(filename);
        fos.write(fileAsByteArray);
        fos.close();
    }

    @Override
    public Iterator read(File file, Class clazz) throws IOException, ClassNotFoundException {
        List<Event> l1 = new LinkedList<Event>();
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(filename);

            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while (dis.available() != 0) {
                Object obj = dis.readByte();
            }

            fis.close();
            bis.close();
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return l1.iterator();
    }

    @Override
    public void close() throws IOException {
    }
}
