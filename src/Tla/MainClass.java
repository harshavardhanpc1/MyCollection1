package Tla;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by intelliswift on 7/29/18.
 */
public class MainClass {
    // In this example Event implements BinaryLoggable
   public static void main(String[]args) throws IOException {
       List<Event> events = new LinkedList<Event>();
       events.add(new Event(1,"ourevent1"));
       events.add(new Event(2,"ourevent2"));
       events.add(new Event(3,"ourevent3"));
       try {
           writeAndReadEvents(events);
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }

    public static void writeAndReadEvents(Iterable<Event> events) throws IOException, ClassNotFoundException {
        // Write given events
        try (BinaryLogger<Event> logger = new BinaryLoggerImpl<Event>("/tmp/events.bin", 100000L)) {
            for (Event event : events) {
                logger.write(event);
            } }
        // Read them back
        BinaryLogger<Event> logger = new BinaryLoggerImpl<Event>("/tmp/events.bin", 100000L);
        Iterator<Event> iterator = logger.read(new File("/tmp/events.bin"), Event.class);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
