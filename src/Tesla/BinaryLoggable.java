package Tesla;

import java.io.IOException;

/**
 * Created by intelliswift on 7/29/18.
 */
public interface BinaryLoggable {
    /**
     * Serialize the fields of this object into a byte array.
     */
     byte[] toBytes(Object obj) throws IOException;

    /**
     * Deserialize the fields of this object from given byte array.
     */
    Object fromBytes(byte[] rawBytes) throws IOException, ClassNotFoundException;
}
