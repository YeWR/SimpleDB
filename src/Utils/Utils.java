package Utils;

import java.util.ArrayList;

public class Utils {
    public static Object byteToObject(byte[] bytes, String type){
        Object obj;
        switch (type){
            case "Int":
                obj = Bytes.bytesToInt(bytes, 0);
                break;
            case "Long":
                obj = Bytes.bytesToLong(bytes);
                break;
            case "Float":
                obj = Bytes.bytesToFloat(bytes, 0);
                break;
            case "Double":
                obj = Bytes.bytesToDouble(bytes);
                break;
            case "String":
                obj = Bytes.bytesToString(bytes);
                break;
            default:
                obj = null;
                break;
        }
        return obj;
    }

    public static String[] toStrings(ArrayList<String> arrayList){
        String[] ans = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); ++i){
            ans[i] = arrayList.get(i);
        }
        return ans;
    }
}
