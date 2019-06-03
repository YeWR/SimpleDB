package serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DoubleSerDeser implements SerDeserializer<Double> {
    @Override
    public Double read(DataInputStream dis) throws IOException {
        double key = dis.readDouble() ;
        return key ;
    }

    @Override
    public void write(Double value, DataOutputStream dos) throws IOException {
        dos.writeDouble(value);
    }
}
