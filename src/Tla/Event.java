package Tla;

import java.io.*;

/**
 * Created by intelliswift on 7/29/18.
 */
public class Event implements BinaryLoggable,Serializable  {
    public int i;
    public String name;

    public Event(int i, String name) {
        this.i = i;
        this.name = name;
    }

    @Override
    public byte[] toBytes(Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(obj);
        return out.toByteArray();
    }

    @Override
    public Object fromBytes(byte[] rawBytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(rawBytes);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }

    /**
     * Serialize the fields of this object into a byte array.
     */


    /**
     * Deserialize the fields of this object from given byte array.
     */
}
