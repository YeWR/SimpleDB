package Utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static Integer[] toIntegers(ArrayList<Integer> arrayList){
        Integer[] ans = new Integer[arrayList.size()];
        for(int i = 0; i < arrayList.size(); ++i){
            ans[i] = arrayList.get(i);
        }
        return ans;
    }

    public static Object stringToObject(String cnt, String type){
        Object obj;
        switch (type){
            case "Int":
                obj = new Integer(cnt);
                break;
            case "Long":
                obj = new Long(cnt);
                break;
            case "Float":
                obj = new Float(cnt);
                break;
            case "Double":
                obj = new Double(cnt);
                break;
            case "String":
                obj = cnt;
                break;
            default:
                obj = null;
                break;
        }
        return obj;
    }

    public static String replaceBlank(String str){
        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("[\t\n]");
            Matcher m = p.matcher(str);
            dest = m.replaceAll(" ");
        }
        return dest;
    }

    public static Object[] combineObj(Object[] o1, Object[] o2){
        Object[] objects = new Object[o1.length + o2.length];
        System.arraycopy(o1, 0, objects, 0, o1.length);
        System.arraycopy(o2, 0, objects, o1.length, o2.length);
        return objects;
    }
}
