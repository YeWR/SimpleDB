package serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FloatSerDeser implements SerDeserializer<Float> {
    @Override
    public Float read(DataInputStream dis) throws IOException {
        float key = dis.readFloat() ;
        return key ;
    }

    @Override
    public void write(Float value, DataOutputStream dos) throws IOException {
        dos.writeFloat(value);
    }
}
