import java.io.*;
import java.util.*;

public class FileOperator {
    private File myFile;
    private Scanner fileReader;

    public FileOperator(String f){
        setFile(f);
    }

    public void setFile(String f) throws IO Exception{
        myFile = new File(f);
        fileReader = new Scanner(myFile);
    }
    public String readLines(){
        return fileReader.nextLine();
    }
}