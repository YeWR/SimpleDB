package Database;

import FileManager.FileManagerBase;

import java.nio.file.Path;

public class Prototype {
    protected static int BLOCK_SIZE, INFO_SIZE;

    public Prototype(){

    }

    boolean overFlow(){
        return false;
    }

    public static int write(FileManagerBase fm, byte[] data){
        return 0;
    }

    public static byte[] read(FileManagerBase fm, int position){
        return null;
    }
}
