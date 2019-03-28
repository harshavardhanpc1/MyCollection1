package Tla;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by intelliswift on 8/5/18.
 */
public class Test {

    public static void main(String [] args) throws IOException, ClassNotFoundException {
        File file = new File("/tmp/events.bin");
        List<Event> events = new LinkedList<Event>();
        events.add(new Event(1,"ourevent1"));
        events.add(new Event(2,"ourevent2"));
        events.add(new Event(4,"ourevent4"));
     //   FileWriter f0 = new FileWriter("output.txt");
        OutputStream opStream = new FileOutputStream(file);
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objStream = new ObjectOutputStream(byteStream);



        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Event event : events) {

       oos.writeObject(event);
            //objStream.writeObject(event);
           //byte[] bytes = byteStream.toByteArray();
           //oos.write(bytes);
//            ByteArrayInputStream byteStreams = new ByteArrayInputStream(bytes);
//            ObjectInputStream objStreams = new ObjectInputStream(byteStreams);
//            Event eventing = (Event)objStreams.readObject();
//            System.out.println(eventing.i+" this "+eventing.name);
         //  oos.write(event);
        }
        oos.close();
  //      bytesOut.close();
     //   opStream.flush();

//        FileInputStream fis = null;
//        BufferedInputStream bis = null;
//        DataInputStream dis = null;
//        fis = new FileInputStream(filename);
//        bis = new BufferedInputStream(fis);
//        dis = new DataInputStream(bis);
//        while (dis.available() != 0) {
//            System.out.println(dis.readLine());
//        }
//        while (dis.available() != 0) {
//            Object obj = dis.readByte();
//
//
//        }
        File files = new File("/tmp/events.bin");

        FileInputStream fileInStr = new FileInputStream(files);
        ObjectInputStream objInStr = new ObjectInputStream(fileInStr);
        try {

            while (true) {
     //           byte fileContent[] = new byte[(int)file.length()];
       //         fileInStr.read(fileContent);
         //                   ByteArrayInputStream byteStreams = new ByteArrayInputStream(fileContent);
           // ObjectInputStream objStreams = new ObjectInputStream(byteStreams);
           // Event eve = (Event)objStreams.readObject();

     Event eve = (Event) objInStr.readObject();
                System.out.println(eve.name);
                System.out.println(eve.i);
            }
        }catch (EOFException endof_file_exception) {
            System.out.println("end of the file");
        } finally {
            objInStr.close();
            fileInStr.close();
        }
//        fis.close();
//        bis.close();
//        dis.close();


    }
}

