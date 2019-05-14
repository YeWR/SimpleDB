package Utils;

import java.nio.ByteBuffer;
import java.util.Comparator;

/**
 * Utilities for converting to and from arrays of bytes
 */
public class Bytes {


    public static byte[] doubleToBytes(double d) {
        long value = Double.doubleToRawLongBits(d);
        byte[] byteRet = new byte[8];
        for (int i = 0; i < 8; i++) {
            byteRet[i] = (byte) ((value >> 8 * i) & 0xff);
        }
        return byteRet;
    }

    public static double bytesToDouble(byte[] arr) {
        long value = 0;
        for (int i = 0; i < 8; i++) {
            value |= ((long) (arr[i] & 0xff)) << (8 * i);
        }
        return Double.longBitsToDouble(value);
    }

    /**
     * 浮点转换为字节
     *
     * @param f
     * @return
     */
    public static byte[] FloatToBytes(float f) {

        // 把float转换为byte[]
        int fbit = Float.floatToIntBits(f);

        byte[] b = new byte[4];
        for (int i = 0; i < 4; i++) {
            b[i] = (byte) (fbit >> (24 - i * 8));
        }

        // 翻转数组
        int len = b.length;
        // 建立一个与源数组元素类型相同的数组
        byte[] dest = new byte[len];
        // 为了防止修改源数组，将源数组拷贝一份副本
        System.arraycopy(b, 0, dest, 0, len);
        byte temp;
        // 将顺位第i个与倒数第i个交换
        for (int i = 0; i < len / 2; ++i) {
            temp = dest[i];
            dest[i] = dest[len - i - 1];
            dest[len - i - 1] = temp;
        }

        return dest;

    }

    /**
     * 字节转换为浮点
     *
     * @param b 字节（至少4个字节）
     * @param index 开始位置
     * @return
     */
    public static float bytesToFloat(byte[] b, int index) {
        int l;
        l = b[index + 0];
        l &= 0xff;
        l |= ((long) b[index + 1] << 8);
        l &= 0xffff;
        l |= ((long) b[index + 2] << 16);
        l &= 0xffffff;
        l |= ((long) b[index + 3] << 24);
        return Float.intBitsToFloat(l);
    }

    public static byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.putLong(0, x);
        return buffer.array();
    }

    public static long bytesToLong(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.put(bytes, 0, bytes.length);
        buffer.flip();//need flip
        return buffer.getLong();
    }

    public static byte[] combineBytes(byte b1, byte[] b2){
        byte[] b3 = new byte[1 + b2.length];
        b3[0] = b1;
        System.arraycopy(b2, 0, b3, 1, b2.length);
        return b3;
    }

    public static byte[] combineBytes(byte[] b1, byte[] b2){
        byte[] b3 = new byte[b1.length + b2.length];
        System.arraycopy(b1, 0, b3, 0, b1.length);
        System.arraycopy(b2, 0, b3, b1.length, b2.length);
        return b3;
    }

    /** converts a positive integer to a byte, treating the byte as an
     unsigned 8 bits.
     If the integer is greater than 255, then the higher order
     bits will be chopped off
     If the integer is negative, then it will be inverted first
     */
    public static byte intToByte(int number){
        return (byte) ((number<0?-number:number) & 0xff);
    }

    /** converts a byte (treated as an unsigned 8 bits) to an integer,
     If the integer is greater than 255, then the higher order
     bits will be chopped off  */
    public static int byteToInt(byte b){
        if (b >= 0) return (int) b & 0xff;
        else return b + 256;
    }

    /** converts an integer to an array of four bytes. */
    public static byte[] intToBytes(int number){
        byte[] ans = new byte[4];
        ans[0] = (byte) (number>>>24);
        ans[1] = (byte) (number>>>16 & 0xff);
        ans[2] = (byte) (number>>>8 & 0xff);
        ans[3] = (byte) (number & 0xff);
        return ans;
    }

    /** converts an integer to four bytes and puts them at the specified
     offset in a byte array. */
    public static void intToBytes(int number, byte[] block, int offset){
        block[offset]  =  (byte) (number>>>24);
        block[offset+1] = (byte) (number>>>16 & 0xff);
        block[offset+2] = (byte) (number>>>8 & 0xff);
        block[offset+3] = (byte) (number & 0xff);
    }

    /** converts an array of four bytes to an integer. */
    public static int bytesToInt(byte[] bytes){
        return (bytes[0]<<24)
                | ((bytes[1]&0xff)<<16)
                | ((bytes[2]&0xff)<<8)
                | (bytes[3]&0xff);
    }

    /** converts the four bytes at the specified offset in a byte array into an integer. */
    public static int bytesToInt(byte[] bytes, int offset){
        if(offset+3 >= bytes.length) return 0;
        return (bytes[offset]<<24)
                | ((bytes[offset+1]&0xff)<<16)
                | ((bytes[offset+2]&0xff)<<8)
                | (bytes[offset+3]&0xff);
    }

    /** converts four bytes to an integer. */
    public static int bytesToInt(byte b1, byte b2, byte b3, byte b4){
        return ((int)b1<<24)
                | (((int)b2&0xff)<<16)
                | (((int)b3&0xff)<<8)
                | ((int)b4&0xff);
    }

    public static byte booleanToByte(boolean state){
        if(state){
            return intToByte(1);
        }else{
            return intToByte(0);
        }
    }

    public static boolean byteToBoolean(byte b){
        if(Bytes.byteToInt(b) == 1){
            return true;
        }else{
            return false;
        }
    }

    public static int compare(byte[] a, byte[] b){
        int shared = a.length;
        if (b.length<shared) shared = b.length;
        for (int i=0; i<shared; i++){
            if (a[i]+128 < b[i]+128) return -1;
            if (a[i]+128 > b[i]+128) return 1;
        }
        // they are the same up to index shared
        if (a.length < b.length) return -1;
        if (a.length > b.length) return 1;
        return 0;
    }

    public static void appendInt(byte[] dest, int k){
        int size=0;
        for(int i=0;i<=dest.length-4;i+=4){
//			System.out.println("Bytes["+i+"]:"+bytesToInt(dest,i));
//			System.out.flush();
            if(bytesToInt(dest, i) != 0){
                size+=4;
            }else{
                //System.out.println("Found end of dest at position " + size);
                break;
            }
        }
//		System.out.println("End: " + size);
//		System.out.println("Dest length: " + dest.length);
        if(size <= dest.length-4){
            //System.out.println("Appending " + k + " at position " + size + ".");
            intToBytes(k, dest, size);
        }
    }
    /**
     * Gets the last filled position of the byte array.
     * If the byte array is full, it returns the length of the array.
     * @param bytes - the byte[] to get the last filled position of.
     * @return the index of the last filled position
     */
    public static int getLastIndex(byte[] bytes){
        int size=0;
        for(int i=0;i<=bytes.length-4;i+=4){
            if(bytesToInt(bytes, i) != 0){
                size+=4;
            }else{
                return size;
            }
        }
        return bytes.length;
    }
    /**
     * Empties the byte array from index and forward
     * @param data - the byte array to empty from
     * @param index - the position to clear from
     */
    public static void clearBytesFromPosition(byte[] data, int index){
        if(index > data.length-4) return;
        for(int i=index; i <= data.length-4; i+=4){
            Bytes.intToBytes(0, data, i);
        }
    }

    public static class ByteArrayComparator implements Comparator<byte[]> {
        public int compare(byte[] a, byte[] b){
            return Bytes.compare(a, b);
        }
    }
}
