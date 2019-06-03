package serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class LongSerDeser implements SerDeserializer<Long> {
    @Override
    public Long read(DataInputStream dis) throws IOException {
        long key = dis.readLong() ;
        return key ;
    }

    @Override
    public void write(Long value, DataOutputStream dos) throws IOException {
        dos.writeLong(value);
    }
}
