import java.io.*;
import java.util.*;

public class FileOperator {
    private File myFile;
    private Scanner fileReader;

    public FileOperator(String f) throws IOException{
        setFile(f);
    }

    // public FileOperator(String url, boolean isOnline){
    //     if (isOnline = true){
    //         setUrl(url);
    //     }
    // }

    // public void setUrl(String filename){
    //     url = new URL(filename);
    //     urlScanner = new Scanner(url.openStream());

    // }

    public void setFile(String f) throws IOException{
        myFile = new File(f);
        fileReader = new Scanner(myFile);
    }
    public String readLine() throws IOException{
        return fileReader.nextLine();
    }

    // public static void main(String[] args) {
        
    // }
}