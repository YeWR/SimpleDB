package Database;

import FileManager.FileManagerBase;

import java.nio.file.Path;

public class Prototype {
    FileManagerBase fm;
    Path path;

    public Prototype(){

    }

    boolean overFlow(){
        return false;
    }

    public int write(byte[] data){
        return 0;
    }

    public byte[] read(int position){
        return null;
    }

    void writeDataToHeader(byte[] headerBytes){

    }

    static void readDataFromHeader(byte[] headerBytes){

    }
}
