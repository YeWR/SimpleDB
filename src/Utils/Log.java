package Utils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

    private FileWriter writer = null;


    public Log() throws IOException {
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String fileName = dateFormat.format(date) + ".log";

        this.writer = new FileWriter(fileName, true);
    }

    public void write(String content){
        Date date=new Date();
        String head = "================" + date + "================";
        try {
            this.writer.write(head);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(content);
    }

    public void write(String title, String content){
        String cnt = title + ": " + content;
        this.write(cnt);
    }

    public void close() throws IOException {
        this.writer.close();
    }

}
